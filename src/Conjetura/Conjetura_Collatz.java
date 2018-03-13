package Conjetura;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Conjetura_Collatz {
	//todos os numeros vai acabar em 1
	
	public static long collatz(long n){
		if(n % 2 == 0)
			return n/2;
		else 
			return 3*n+1;
	}
	public static void main(String[] args) {
		List<Long> lista = new LinkedList<>();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Escolha um numero: ");
		long n = Long.parseLong(scn.nextLine());
		scn.close();
		lista.add(n);
		long inic = System.currentTimeMillis();
		while(lista.get(lista.size()-1) != 1){
			lista.add(collatz(lista.get(lista.size()-1)));
			System.out.println(lista.get(lista.size()-1));
		}
		long res = System.currentTimeMillis() - inic;
		System.out.println("Tempo decorrido:" + res);

	}

}

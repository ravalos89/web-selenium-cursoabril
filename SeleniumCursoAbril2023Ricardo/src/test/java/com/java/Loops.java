package com.java;

public class Loops {

	public static void main(String[] args) {
		// LOOPS
		
		// WHILE - Contador While
		
		int cont = 1;
		
		while(cont<=10) {
			System.out.println("While numero es "+ cont);
			cont++;
		}
		
//		Do While
		
//		¿Cuantas veces se tiene que sumar a si mismo un numero para llegar a 100?
		
		int numero = 30;
		int sumTotal = 0;
		int count = 0;
		
		do {
			sumTotal = sumTotal + numero;
			++count;
		} while(sumTotal<100);
		
		System.out.println("el numero "+numero+ " se sumo "+count+ " veces para llegar a 100");
		
		
//		FOR
		
		int numeroFor = 10;
		
		for(int i = 1; i<=numeroFor; i++) {
			System.out.println("El numero FOR es "+i);
		}

	}

}

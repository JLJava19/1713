package com.ipartek.formacion.ejercicios.generales;

import java.util.Scanner;

/**
 * Serie de Fibonacci en Java Programa que imprima los N primeros números de la
 * serie de Fibonacci. El primer número de la serie es 1, el segundo número es 1
 * y cada uno de los siguientes es la suma de los dos anteriores. 1, 1, 2, 3, 5,
 * 8, 13, ....... , N
 * 
 * @author Jose
 */

public class Fibonacci {

	public static void main(String[] args) {

		// Introducir numero, sacara los numeros anteriores de la serie Fibonacci

		int primero = 1;
		int segundo = 1;

		int fibonacci = 0;
		int numero = 0;

		boolean repetir = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Dime un numero");
			fibonacci = Integer.parseInt(sc.nextLine());
			
			primero = 1;
			segundo = 1;
			
			System.out.println(primero);
			System.out.println("," + segundo);

			
			do {
				numero = primero + segundo;
				
				primero = segundo;
				segundo = numero;
				
				System.out.println(", " + numero);

			} while (fibonacci <= numero);
			
			
		} while (repetir);

		sc.close();
	}

}

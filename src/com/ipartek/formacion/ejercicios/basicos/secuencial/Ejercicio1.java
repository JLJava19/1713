package com.ipartek.formacion.ejercicios.basicos.secuencial;

import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		// declaraci�n de variables
		/*
		 * int n1, n2; Scanner sc = new Scanner(System.in); // leer el primer n�mero
		 * System.out.println("Introduce un n�mero entero: "); n1 = sc.nextInt(); // lee
		 * un entero por teclado // leer el segundo n�mero
		 * System.out.println("Introduce otro n�mero entero: "); n2 = sc.nextInt(); //
		 * lee un entero por teclado // mostrar resultado
		 * System.out.println("Ha introducido los n�meros: " + n1 + " y " + n2);
		 * 
		 * Scanner sc = new Scanner(System.in); String cadena;
		 * System.out.println("Introduce un nombre: "); cadena = sc.nextLine();
		 * System.out.println("Buenos D�as " + cadena);
		 */

		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un n�mero entero:");
		numero = sc.nextInt();
		System.out.println("N�mero introducido: " + numero);
		System.out.println("Doble de " + numero + " -> " + 2 * numero);
		System.out.println("Triple de " + numero + " -> " + 3 * numero);
		
		sc.close();
	}
}

package com.ipartek.formacion.ejercicios.basicos.secuencial;

import java.util.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		// declaración de variables
		/*
		 * int n1, n2; Scanner sc = new Scanner(System.in); // leer el primer número
		 * System.out.println("Introduce un número entero: "); n1 = sc.nextInt(); // lee
		 * un entero por teclado // leer el segundo número
		 * System.out.println("Introduce otro número entero: "); n2 = sc.nextInt(); //
		 * lee un entero por teclado // mostrar resultado
		 * System.out.println("Ha introducido los números: " + n1 + " y " + n2);
		 * 
		 * Scanner sc = new Scanner(System.in); String cadena;
		 * System.out.println("Introduce un nombre: "); cadena = sc.nextLine();
		 * System.out.println("Buenos Días " + cadena);
		 */

		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un número entero:");
		numero = sc.nextInt();
		System.out.println("Número introducido: " + numero);
		System.out.println("Doble de " + numero + " -> " + 2 * numero);
		System.out.println("Triple de " + numero + " -> " + 3 * numero);
		
		sc.close();
	}
}

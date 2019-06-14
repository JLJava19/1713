package com.ipartek.formacion.ejercicios.basicos;

import java.util.Scanner;

/**
 * @see http://www.campus.formacion.ipartek.com/moodle/mod/page/view.php?id=882
 * @author Curso
 *
 */

public class VariablesPrimitivasWrappers {

	public static void main(String[] args) {

		// declarar todas los posibles tipos de variables primitivas

		// Numero enteros

		byte b = 2;
		short s = 4;
		int i = 0;
		long l = 8;

		// Numeros reales

		float f = 2.34f;
		double lo = 4.56;

		char c = 'a'; // Comillas simples
		boolean b1 = true; // or false

		// Wrappers

		int numeroParseado = Integer.parseInt("3");

		System.out.printf("El rango de un int %d %d \n\n", Integer.MIN_VALUE, Integer.MAX_VALUE);

		// Indicar si el caracter introducido es mayuscula o minuscula letra numero
		System.out.println("Por favor introduce un caracter ");
		Scanner sc = new Scanner(System.in);
		char caracter = sc.next().charAt(0);
		System.out.println("Has escrito \n \n" + caracter);

		System.out.println("Por favor introduce un caracter ");
		Scanner sc2 = new Scanner(System.in);
		char caracter2 = sc2.next().charAt(0);

		Boolean caracterMayuscula = Character.isUpperCase(caracter2);
		
		System.out.println(Character.isLetter(caracter2) ? "Es letra" : "No es letra");
		System.out.println(Character.isLowerCase(caracter2) ? "Es minuscula" : "No es minuscula");
		System.out.println(Character.isLetterOrDigit(caracter2) ? "Letras o numero" : "***Es un caracter especial***");
		
		if (!Character.isDigit(caracter2)) {
			if (caracterMayuscula == true) {
				System.out.println("Es  mayuscula " + caracterMayuscula);
			} else {
				System.out.println("Es  manuscula " + caracterMayuscula);
			}
		}else {
			System.out.println("Es un numero");
		}

		sc.close();
		sc2.close();
		// Character.isUpperCase(124)

	}

}

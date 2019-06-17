package com.ipartek.formacion.utilidades.examen;

import java.util.Scanner;

/**
 * Programa que muestra la categoria de un boxeador pidiendo su peso Se lanzara
 * una excepci�n si el valor introducido no es num�rico y si es un valor
 * negativo.
 * 
 * @author Jose
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) throws Exception {
		// M�ximo de boxeadores
		final int BOXEADORES = 30;
		int contador = 0;
		int peso = 0;
		boolean salir = false;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce el peso del boxeador: \n");

			try {

				peso = Integer.parseInt(sc.next());

				if (peso < 0)
					throw new Exception("No se puede introducir un valor negativo");

				if (peso > 90) {
					System.out.println("Su peso es superior a 90 kg.");
				} else if (peso >= 65 && peso <= 90) {
					System.out.println("Su peso est� comprendido entre 65 y 90 kg.");
				} else if (peso >= 58 && peso <= 64) {
					System.out.println("Su peso est� comprendido entre 58 y 64 kg.");
				} else if (peso >= 52 && peso <= 67) {
					System.out.println("Su peso est� comprendido entre 52 y 67 kg.");
				} else {
					System.out.println("Su peso es inferior a 52 kg.");
				}

				contador += 1;
			} catch (NumberFormatException e) {
				System.out.println("Ha introducido datos sin el formato indicado o fuera de rango");
				System.out.println("El error es " + e.getMessage());
				salir = true;
			}

		} while ((contador < BOXEADORES) && (!salir));

		sc.close();
	}

}

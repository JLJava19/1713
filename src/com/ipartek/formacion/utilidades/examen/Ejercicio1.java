package com.ipartek.formacion.utilidades.examen;

import java.util.Scanner;

/**
 * Programa que muestra la categoria de un boxeador pidiendo su peso Se lanzara
 * una excepción si el valor introducido no es numérico y si es un valor
 * negativo.
 * 
 * @author Jose
 *
 */

public class Ejercicio1 {

	final static int PESO_MOSCA=52;
	final static int PESO_PLUMA=57;
	final static int PESO_LIGERO=65;
	final static int PESO_MEDIANO=90;
	// >90 PESADO
	// Máximo de boxeadores
	final static int BOXEADORES = 30;
	
	public static void main(String[] args) throws Exception {
		
		int contador = 0;
		int peso = 0;
		boolean salir = false;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduce el peso del boxeador: \n");

			try {

				peso = Integer.parseInt(sc.nextLine());

				if (peso < 0)
					throw new Exception("No se puede introducir un valor negativo");

				if (peso > 90) {
					System.out.println("Su peso es superior a 90 kg.");
				} else if (peso >= PESO_LIGERO && peso <= PESO_MEDIANO) {
					System.out.println("Su peso está comprendido entre 65 y 90 kg.");
				} else if (peso > PESO_PLUMA && peso < PESO_LIGERO) {
					System.out.println("Su peso está comprendido entre 58 y 64 kg.");
				} else if (peso >= PESO_MOSCA && peso <= PESO_PLUMA) {
					System.out.println("Su peso está comprendido entre 52 y 67 kg.");
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

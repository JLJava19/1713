package com.ipartek.formacion;

import java.util.Random;

public class Aula {

	public static void main(String[] args) {

		// Declarar array con nombre alumnos

		String[] nombres = new String[3];
		/* String[] nombres2 = {"Mounir", "Andoni", "Asier", "Jon C", 
		"Arkaitz", "Aritz", "Manuel", "Eduardo", "Eder i", "Eder S", 
		"Gaizka", "Borja", "Verónica", "Jon A", "Jose Luis"};
		nombres[0] = "Pepe";
		nombres[1] = "Juan";
		nombres[2] = "Ander";*/

		int numero = (int) (Math.random() * nombres.length);
		System.out.println("El voluntario es " + numero);

		for (int i = 0; i < nombres.length; i++) {
			if (numero != i) {
				System.out.println("i = " + i + " " + nombres[i]);
			} else {
				System.out.println("**** i = " + i + " " + nombres[i]);
			}

		}
		// Generar numero aleatorio
		Random rand = new Random();
		int n = rand.nextInt(3);

		// Mostrat voluntario para leer
		System.out.println(" El elegido es " + nombres[n]);

	}

}

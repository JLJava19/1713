package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Random;

public class Aula2 {

	// Se guarda el indice del voluntario anterior
	static int iVoluntarioAnterior = 0;
	static ArrayList<Alumno> aAlumnos = new ArrayList<Alumno>();
	
	public static void main(String[] args) {

		// Declarar array con nombre alumnos

		
		String[] nombres = { "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eduardo", "Eder i",
				"Eder S", "Gaizka", "Borja", "Verónica", "Jon A", "Jose Luis" };

		// Crear los alumnos
		for (int i = 0; i < nombres.length; i++) {

			aAlumnos.add(new Alumno(nombres[i], 99, 'i'));

		}

		// Mostrar el menu
		menuAlumnos();

		// Generar numero aleatorio
		Random rand = new Random();
		int n = rand.nextInt(3);

		// Mostrat voluntario para leer
		System.out.println(" El elegido es " + nombres[n]);

	}

	/**
	 * 
	 * @return String con las diferentes opciones
	 */
	public static String menuAlumnos() {

		String l1 = "1.- Listar Alumnos + Ranking \n";
		String l2 = "2.- Crear Alumno \n";
		String l3 = "3.- Eliminar Alumno \n";
		String l4 = "4.-Buscar Voluntario \n\n";
		String l5 = "Seleccione una opción \n";
		return l1 + l2 + l3 + l4 + l5;
	}

	/**
	 * Selecciona el metodo
	 * 
	 * @param opcion int con las opciones disponibles
	 * @param aAlumnos el array de Alumnos
	 */
	public static void seleccionarOpcion(int opcion, Alumno[] aAlumnos) {
		
		switch (opcion) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
	
			break;
		case 4:
			iVoluntarioAnterior=buscarVoluntario(aAlumnos, iVoluntarioAnterior);
			break;
		case 5:
			// Salir ??????????
			break;
		default:
			break;
		}
		
	}

	/**
	 * Busca voluntario para leer tutorial Java
	 * 
	 * @param nombres  String[] con los alumnos de la clase
	 * @param anterior int con el indice del ultimo que ha sido voluntario
	 * @return int con el indice del nuevo voluntario
	 */
	public static int buscarVoluntario(Alumno[] alumnos, int anterior) {
		int iVoluntario = 0;

		do {
			iVoluntario = (int) (Math.random() * alumnos.length);
		} while (iVoluntario != anterior);

		return iVoluntario;
	}

}

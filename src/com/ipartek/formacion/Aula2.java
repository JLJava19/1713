package com.ipartek.formacion;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Aula2 {

	static final int OPCION_LISTAR = 1;
	static final int OPCION_CREAR_ALUMNO = 2;
	static final int OPCION_ELIMINAR_ALUMNO = 3;
	static final int OPCION_BUSCAR_VOLUNTARIO = 4;
	static final int OPCION_SALIR = 5;

	// Se guarda el indice del voluntario anterior
	static int iVoluntarioAnterior = 0;
	static ArrayList<Alumno> aAlumnos = new ArrayList<Alumno>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Declarar array con nombre alumnos
		int opcionSeleccionada = 5;

		String[] nombres = { "Mounir", "Andoni", "Asier", "Jon C", "Arkaitz", "Aritz", "Manuel", "Eduardo", "Eder i",
				"Eder S", "Gaizka", "Borja", "Verónica", "Jon A", "Jose Luis" };

		// Crear los alumnos
		for (int i = 0; i < nombres.length; i++) {

			aAlumnos.add(new Alumno(nombres[i], 99, 'i'));

		}

		// Mostrar el menu
		do {
			System.out.println(menuAlumnos());
			try {
				opcionSeleccionada = Integer.parseInt(sc.nextLine());
				seleccionarOpcion(opcionSeleccionada);
			}catch(Exception NumberFormatException) {
				System.out.println("MALLLLLLL, ADIOS");
			}
			
			
		} while (opcionSeleccionada != OPCION_SALIR);
		/*
		 * // Generar numero aleatorio Random rand = new Random(); int n =
		 * rand.nextInt(3);
		 * 
		 * // Mostrat voluntario para leer System.out.println(" El elegido es " +
		 * nombres[n]);
		 */
		sc.close();
	}

	/**
	 * 
	 * @return String con las diferentes opciones
	 */
	public static String menuAlumnos() {

		String l1 = "1.- Listar Alumnos + Ranking \n";
		String l2 = "2.- Crear Alumno \n";
		String l3 = "3.- Eliminar Alumno \n";
		String l4 = "4.- Buscar Voluntario \n";
		String l5 = "5.- SALIR \n\n";
		String l6 = "Seleccione una opción \n";
		return l1 + l2 + l3 + l4 + l5 + l6;
	}

	/**
	 * Selecciona el metodo
	 * 
	 * @param opcion    int con las opciones disponibles
	 * @param aAlumnos2 el array de Alumnos
	 */
	public static void seleccionarOpcion(int opcion) {

		switch (opcion) {
		case OPCION_LISTAR:
			System.out.println(listarAlumnos());
			break;
		case OPCION_CREAR_ALUMNO:
			crearAlumno();
			break;
		case OPCION_ELIMINAR_ALUMNO:
			eliminarAlumno();
			break;
		case OPCION_BUSCAR_VOLUNTARIO:
			buscarVoluntario(iVoluntarioAnterior);
			break;
		case OPCION_SALIR:
			System.out.println("********* Adios **********");
			break;
		default:
			break;
		}

	}

	private static void eliminarAlumno() {
		String nombre = "";

		System.out.println("Que alumno quieres eliminar? \n");
		nombre = sc.nextLine();

		for (int i = 0; i < aAlumnos.size(); i++) {
			if (nombre.equals(aAlumnos.get(i).getNombre())) {
				aAlumnos.remove(i);
			}
		}

		System.out.println(listarAlumnos());
	}

	/**
	 * Crea un alumno
	 * 
	 */
	private static void crearAlumno() {

		String nombre;
		int edad;
		float altura;
		float peso;
		String ojos;
		char sexo;

		System.out.println("El nombre: \n");
		nombre = sc.nextLine();
		/*
		 * System.out.println("Edad: \n"); edad = Integer.parseInt(sc.nextLine());
		 * System.out.println("Altura: \n"); altura = (float) sc.nextDouble();
		 * System.out.println("Peso: \n"); peso = (float) sc.nextDouble();
		 * System.out.println("Ojos: \n"); ojos = sc.nextLine();
		 * System.out.println("Sexo: \n"); sexo = sc.nextLine().charAt(0);
		 * 
		 * aAlumnos.add(new Alumno(nombre, edad, altura, peso, ojos, sexo));
		 */
		aAlumnos.add(new Alumno(nombre));
		System.out.println(listarAlumnos());
	}

	/**
	 * Busca voluntario para leer tutorial Java
	 * 
	 * @param nombres  String[] con los alumnos de la clase
	 * @param anterior int con el indice del ultimo que ha sido voluntario
	 * @return int con el indice del nuevo voluntario
	 */
	public static void buscarVoluntario(int anterior) {
		int iVoluntario = 0;

		do {
			iVoluntario = (int) (Math.random() * aAlumnos.size());
		} while (iVoluntario == anterior);

		iVoluntarioAnterior = iVoluntario;
		System.out.println("El voluntario es " + aAlumnos.get(iVoluntario).getNombre());

		int sumaVeces = aAlumnos.get(iVoluntario).getNumVecesLeer();
		aAlumnos.get(iVoluntario).setNumVecesLeer(sumaVeces + 1);
	}

	/**
	 * 
	 * 
	 * @return String con el listado de los alumnos
	 */

	public static String listarAlumnos() {
		String listadoAlumnos = "****** Listado de alumnos ******\n";
		for (int i = 0; i < aAlumnos.size(); i++) {

			listadoAlumnos += i + 1 + ".- " + aAlumnos.get(i).getNombre() + " " + aAlumnos.get(i).getNumVecesLeer()
					+ " veces\n";
		}

		listadoAlumnos += "****************************\n";
		return listadoAlumnos;
	}

}

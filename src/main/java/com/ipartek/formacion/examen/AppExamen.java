package com.ipartek.formacion.examen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;
import com.ipartek.formacion.examen.ComparatorCPU;

public class AppExamen {

	final static int OPCION_LISTAR = 1;
	final static int OPCION_CREAR = 2;
	final static int OPCION_BORRAR = 3;
	final static int OPCION_ORDENAR_CPU = 4;
	final static int OPCION_GUARDAR_A_TEXTO = 5;
	final static int OPCION_SALIR = 0;

	static int opcionSeleccionada;
	static Scanner sc;
	static ArrayList<Portatil> listaPortatiles;
	static ArrayList<Sobremesa> listaSobremesa;
	static DAOOrdenadorArrayList dao;

	private static void listar() {

		// ordenar por ranking y nombre
		// TODO ordenar
		// Collections.sort(dao.getAll(), new ComparatorCPU());

		// Collections.sort(dao.getAll());

		System.out.println("-----------------------------");
		System.out.println("-----Listado de ordenadores------");
		System.out.println("-----------------------------");
		System.out.println("Nº Veces\tId\tNombre");

		if (dao.getAll() != null) {

			for (Object ordenador : dao.getAll()) {
				// TODO
				if (ordenador instanceof Portatil) {
					Portatil p = (Portatil) ordenador;
					System.out.println(p.getId() + " " + p.getNombre() + " " + p.getPlacaBase() + " " + p.getCpu() + " "
							+ p.getTamanyoPantalla() + " " + p.getBateria());
				} else {
					Sobremesa s = (Sobremesa) ordenador;
					System.out.println(s.getId() + " " + s.getNombre() + " " + s.getPlacaBase() + " " + s.getCpu() + " "
							+ s.getTipoTorre() + " " + s.isGrabadora());
				}

			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

		sc = new Scanner(System.in);
		dao = DAOOrdenadorArrayList.getInstance();

		do {

			pintarMenuYpedirOpcion();

			switch (opcionSeleccionada) {
			case OPCION_LISTAR:
				listar();
				break;

			case OPCION_CREAR:
				crear();
				break;

			case OPCION_BORRAR:
				// borrar();
				break;

			case OPCION_ORDENAR_CPU:
				// modificar();
				break;

			case OPCION_GUARDAR_A_TEXTO:
				// voluntario();
				break;

			default:
				break;
			}

		} while (opcionSeleccionada != OPCION_SALIR);

		System.out.println("Hasta la próxima!!!");

		sc.close();

	}

	private static void crear() {
		try {
			char opcion = 'p';
			do {

				System.out.println("Desea crear un portatil (p) o sobremesa(s)");
				opcion = sc.nextLine().charAt(0);
			} while (opcion != 'p' || opcion != 's');

			Portatil p;
			Sobremesa s;

			int id;
			String nombre;
			String placaBase;
			int cpu;

			int tamanyoPantalla;
			int bateria;

			String tipoTorre;
			boolean grabadora;

			System.out.println("Id:");
			id = Integer.parseInt(sc.nextLine());
			System.out.println("Nombre:");
			nombre = sc.nextLine();
			System.out.println("Placa Base:");
			placaBase = sc.nextLine();
			System.out.println("CpU:");
			cpu = Integer.parseInt(sc.nextLine());

			if (opcion == 'p') {
				System.out.println("Tamaño de pantalla:");
				tamanyoPantalla = Integer.parseInt(sc.nextLine());
				System.out.println("Bateria:");
				bateria = Integer.parseInt(sc.nextLine());
				p = new Portatil(id, nombre, placaBase, cpu, tamanyoPantalla, bateria);

			} else {
				System.out.println("Tipo de torre:");
				tipoTorre = sc.nextLine();
				System.out.println("Grabadora?:");
				grabadora = true;
				s = new Sobremesa(id, nombre, placaBase, cpu, tipoTorre, grabadora);
			}
			Alumno a = new Alumno();
			System.out.println("Nombre");
			a.setNombre(sc.nextLine());
			System.out.println("Id");
			a.setId(Integer.parseInt(sc.nextLine()));

			// persistir a traves del dao
			if (dao.insert(a)) {
				System.out.println("Ordenador creado satisfactoriamente");
			} else {
				System.out.println("Fallo al insertar el ordenador");
			}
		} catch (Exception e) {
			System.out.println("Introduce un valor numerico en id");
			crear();
		}

	}

	private static void pintarMenuYpedirOpcion() {

		System.out.println("-------------------------------");
		System.out.println("  1 Listar");
		System.out.println("  2 Crear");
		System.out.println("  3 Eliminar");
		System.out.println("  4 Ordenar CPU");
		System.out.println("  5 Guardar a texto");
		System.out.println("-------------------------------");
		System.out.println("  0 para salir");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("Dime tu opcion.....");

		try {

			opcionSeleccionada = Integer.parseInt(sc.nextLine());

		} catch (Exception e) {
			System.out.println("*** opcion no posible **** ");

			pintarMenuYpedirOpcion();

		}

	}

}

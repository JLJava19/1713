package com.ipartek.formacion.casa.examen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.ipartek.formacion.ComparatorNombre;
import com.ipartek.formacion.modelo.DAOOrdenadorArrayList;

//public class AppExamen implements Comparable<Ordenador>{
public class AppExamen {
	final static int OPCION_LISTAR = 1;
	final static int OPCION_CREAR = 2;
	final static int OPCION_BORRAR = 3;
	final static int OPCION_GUARDAR_A_FICHERO = 4;
	final static int OPCION_ORDENAR_POR_PROCESADOR = 5;
	final static int OPCION_SALIR = 0;

	static int opcionSeleccionada;
	static Scanner sc;
	//static ArrayList<Object> lista;
	static DAOOrdenadorArrayList dao;

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
				borrar();
				break;

			case OPCION_GUARDAR_A_FICHERO:
				guardarAFichero();
				break;

			case OPCION_ORDENAR_POR_PROCESADOR:
				ordenarPorProcesador();
				break;

			default:
				break;
			}

		} while (opcionSeleccionada != OPCION_SALIR);

		System.out.println("Hasta la próxima!!!");

		sc.close();
	}

	private static void guardarAFichero() {
		System.out.println("Guardado en archivo.");
		dao.serializarLista();
		
	}

	private static void ordenarPorProcesador() {
		// TODO ordenarPorProcesador
		//ArrayList<IOrdenable> listaCPU = new ArrayList<IOrdenable>();
		
		//for (Object ordenador : dao.getAll()) 
			
		
		//for (IOrdenable iOrdenable : listaCPU) {
			
		
		//listaCPU = (ArrayList<IOrdenable>) lista;
		//Collections.sort(dao.getAll(), new ComparadorCPU());

	}

	

	private static void crear() {
		try {

			int id;
			String nombre;
			String placaBase;
			int cpu;

			int tamanyoPantalla;
			int bateria;

			String tipoTorre;
			boolean grabadora;

			char opcion;
			opcion = '-';

			do {
				System.out.println("Pulse (p) para introducir un portatil o (s) sobremesa");
				opcion = sc.nextLine().charAt(0);
			} while (opcion != 'p' && opcion != 's');

			System.out.println("Id");
			id = Integer.parseInt(sc.nextLine());
			System.out.println("Nombre");
			nombre = sc.nextLine();
			System.out.println("Placa Base");
			placaBase = sc.nextLine();
			System.out.println("CPU");
			cpu = Integer.parseInt(sc.nextLine());

			if (opcion == 'p') {
				System.out.println("Tamaño de pantalla");
				tamanyoPantalla = Integer.parseInt(sc.nextLine());
				System.out.println("Bateria");
				bateria = Integer.parseInt(sc.nextLine());

				Portatil p1 = new Portatil(id, nombre, placaBase, cpu, tamanyoPantalla, bateria);
				// persistir a traves del dao
				if (dao.insert(p1)) {
					System.out.println("Portatil creado satisfactoriamente");
				} else {
					System.out.println("Fallo al insertar el portatil");
				}

			} else {
				System.out.println("Tipo de torre");
				tipoTorre = sc.nextLine();
				grabadora = true;

				Sobremesa s1 = new Sobremesa(id, nombre, placaBase, cpu, tipoTorre, grabadora);

				if (dao.insert(s1)) {
					System.out.println("Sobremesa creado satisfactoriamente");
				} else {
					System.out.println("Fallo al insertar el Sobremesa");
				}
			}

		} catch (Exception e) {
			System.out.println("Introduce un valor numerico");
			crear();
		}

	}

	private static void borrar() {

		int id = 0;

		System.out.println("Id del ordenador");
		id = Integer.parseInt(sc.nextLine());

		if (dao.delete(id)) {
			System.out.println("Ordenador borrado satisfactoriamente");

		} else {
			System.out.println("Error al borrar el ordenador");
		}

	}

	/**
	 * Muestra el listado de portatiles y sobremesa
	 * 
	 */
	private static void listar() {

		// ordenar por cpu
		 //Collections.sort(dao.getAll(), new ComparadorCPU());

		String descripcionOrdenador = "";

		Portatil p;
		Sobremesa s;

		System.out.println("----------------------------------------------------------");
		System.out.println("------------------Listado de Ordenadores------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("Id\tNombre\t\tPlaca Base\tCPU");

		for (Object ordenador : dao.getAll()) {
			
			if (ordenador instanceof Portatil) {
				p = (Portatil) ordenador;
				descripcionOrdenador = p.getId() + "\t" + p.getNombre() + "\t\t" + p.getPlacaBase() + " " + p.getCpu()
						+ "bits, pantalla de " + p.getTamanyoPantalla() + "pulgadas y  " + p.getBateria() + " de mAh";
			} else {
				s = (Sobremesa) ordenador;
				descripcionOrdenador = s.getId() + "\t" + s.getNombre() + "\t\t" + s.getPlacaBase() + " " + s.getCpu()
						+ "bits, el tipo de torrees " + s.getTipoTorre();
				if (s.getGrabadora()) {
					descripcionOrdenador += " y tiene grabadora";
				}
			}
			System.out.println(descripcionOrdenador);
		
		}

	}

	/**
	 * Muestra por pantalla las opciones disponibles
	 * 
	 * Si no se escribe un entero se vuelve a mostrar el menu
	 * 
	 * Opción 0 para salir
	 * 
	 */

	private static void pintarMenuYpedirOpcion() {

		System.out.println("-------------------------------");
		System.out.println("  1 Listar");
		System.out.println("  2 Crear");
		System.out.println("  3 Eliminar");
		System.out.println("  4 Guardar a fichero");
		System.out.println("  5 Ordenar por procesador");
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
package com.ipartek.formacion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.ipartek.formacion.Alumno;
import com.ipartek.formacion.modelo.DAOAlumnoArrayList;

public class AppVoluntarios2 {

	final static int OPCION_LISTAR = 1;
	final static int OPCION_CREAR = 2;
	final static int OPCION_BORRAR = 3;
	final static int OPCION_VOLUNTARIO = 4;
	final static int OPCION_MODIFICAR = 5;
	final static int OPCION_SALIR = 0;

	static int iVoluntarioAnterior = 0;

	static int opcionSeleccionada;
	static Scanner sc;
	static ArrayList<Alumno> lista;
	static DAOAlumnoArrayList dao;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		sc = new Scanner(System.in);
		dao = DAOAlumnoArrayList.getInstance();

		// dao.getById(id)

		// dao.delete(id)

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

			case OPCION_MODIFICAR:
				modificar();
				break;

			case OPCION_VOLUNTARIO:
				voluntario();
				break;

			default:
				break;
			}

		} while (opcionSeleccionada != OPCION_SALIR);

		System.out.println("Hasta la próxima!!!");

		sc.close();

	}

	private static void modificar() {
		try {
			int id = 0;

			System.out.println("Id");
			id = Integer.parseInt(sc.nextLine());

			Alumno aModificar = new Alumno();
			aModificar = dao.getById(id);

			// persistir a traves del dao
			if (aModificar != null) {

				String nuevoNombre = "";
				System.out.println("Nuevo nombre de " + dao.getById(id).getNombre());
				nuevoNombre = sc.nextLine();
				aModificar.setNombre(nuevoNombre);

				dao.update(aModificar);

				System.out.println("Alumno modificado satisfactoriamente");
			} else {
				System.out.println("No se ha encontrado el alumno");
			}
		} catch (Exception e) {
			System.out.println("Introduce un valor numerico en id");
			modificar();
		}

	}

	private static void voluntario() {
		int iVoluntario = 0;

		do {
			iVoluntario = (int) (Math.random() * dao.getAll().size());
		} while (iVoluntario == iVoluntarioAnterior);

		iVoluntarioAnterior = iVoluntario;

		Alumno aVoluntario = new Alumno();
		aVoluntario = dao.getAll().get(iVoluntario);
		System.out.println("El voluntario es " + aVoluntario.getNombre());

		int sumaVeces = aVoluntario.getNumVecesLeer();
		aVoluntario.setNumVecesLeer(sumaVeces + 1);

	}

	private static void crear() {
		try {
			Alumno a = new Alumno();
			System.out.println("Nombre");
			a.setNombre(sc.nextLine());
			System.out.println("Id");
			a.setId(Integer.parseInt(sc.nextLine()));

			// persistir a traves del dao
			if (dao.insert(a)) {
				System.out.println("Alumno creado satisfactoriamente");
			} else {
				System.out.println("Fallo al insertar el alumno");
			}
		} catch (Exception e) {
			System.out.println("Introduce un valor numerico en id");
			crear();
		}

	}

	private static void borrar() {

		int id = 0;

		System.out.println("Id del alumno");
		id = Integer.parseInt(sc.nextLine());

		if (dao.delete(id)) {
			System.out.println("Alumno borrado satisfactoriamente");

		} else {
			System.out.println("Error al borrar el usuario");
		}

	}

	private static void listar() {

		// ordenar por ranking y nombre
		Collections.sort(dao.getAll(), new ComparatorNombre());

		Collections.sort(dao.getAll());

		System.out.println("-----------------------------");
		System.out.println("-----Listado de Alumnos------");
		System.out.println("-----------------------------");
		System.out.println("Nº Veces\tId\tNombre");
		
		for (Alumno alumno : dao.getAll()) {
			System.out.println(" " + alumno.getNumVecesLeer() + "\t\t" + alumno.getId() + "\t" + alumno.getNombre());
		}

	}

	private static void pintarMenuYpedirOpcion() {

		System.out.println("-------------------------------");
		System.out.println("  1 Listar");
		System.out.println("  2 Crear");
		System.out.println("  3 Eliminar");
		System.out.println("  4 Voluntario");
		System.out.println("  5 Modificar");
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
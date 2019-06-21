package com.ipartek.formacion.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.Alumno;

//public class DAOAlumnoArrayList implements IPersistible<Alumno>, ISingletonable<DAOAlumnoArrayList> {
public class DAOAlumnoArrayList implements IPersistible<Alumno> {

	private static DAOAlumnoArrayList INSTANCE;
	private ArrayList<Alumno> lista;
	public String fichero;

	/**
	 * Encargado de devolver solo 1 objeto, patron singleton
	 * 
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException 
	 */
	public static synchronized DAOAlumnoArrayList getInstance() throws FileNotFoundException, IOException, ClassNotFoundException {
		if (INSTANCE == null) {
			INSTANCE = new DAOAlumnoArrayList();
		}
		return INSTANCE;
	}

	/**
	 * Privado para que nadie pueda crear objetos
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException 
	 */
	private DAOAlumnoArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {

		super();
		lista = new ArrayList<Alumno>();
		lista.add(new Alumno(12, "Antton"));
		lista.add(new Alumno(45, "MAriJose"));
		lista.add(new Alumno(2, "Pepe"));
		lista.add(new Alumno(44, "Txeila"));

		fichero = "C:\\1713\\eclipse-workspace\\1713\\personas.txt";

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));

		for (int i = 0; i < lista.size(); i++) {
			// ojo, se hace un new por cada Persona. El new dentro del bucle.

			oos.writeObject(lista.get(i));
		}
		
		oos.close(); // Se cierra al terminar.
		
		// Vacio el array
		lista.clear();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
		
		// Se lee el primer objeto
		Object aux = ois.readObject();

		// Mientras haya objetos
		while (aux != null ) {
			if (aux instanceof Alumno)
				System.out.println(aux); // Se escribe en pantalla el objeto
			aux = ois.readObject();
		}
		ois.close();
	}

	@Override
	public List<Alumno> getAll() {
		return lista;
	}

	@Override
	public Alumno getById(int id) {
		Alumno resul = null;
		for (Alumno a : lista) {

			if (a.getId() == id) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean insert(Alumno pojo) {

		return lista.add(pojo);
	}

	@Override
	public boolean delete(int id) {

		return lista.remove(this.getById(id));

	}

	@Override
	public boolean update(Alumno pojo) {
		boolean encontrado = false;

		for (Alumno alumno : lista) {
			if (alumno.getId() == pojo.getId()) {
				alumno = pojo;
				encontrado = true;
				break;
			}

		}

		return encontrado;
	}

}
package com.ipartek.formacion.examen;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


//import com.ipartek.formacion.MetaDato;
import com.ipartek.formacion.examen.Ordenador;

import com.ipartek.formacion.modelo.IPersistible;

public class DAOOrdenadorArrayList implements IPersistible<Object> {

	private static DAOOrdenadorArrayList INSTANCE;
	private ArrayList<Object> lista;
	public String fichero;

	/**
	 * Encargado de devolver solo 1 objeto, patron singleton
	 * 
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	public static synchronized DAOOrdenadorArrayList getInstance()
			throws FileNotFoundException, IOException, ClassNotFoundException {
		if (INSTANCE == null) {
			INSTANCE = new DAOOrdenadorArrayList();
		}
		return INSTANCE;
	}

	public DAOOrdenadorArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {
		super();
		//MetaDato metaData;

		lista = new ArrayList<Object>();
		
		lista.add(new Portatil(1, "Portatil 1", "Placa 1", 64, 14, 2300));
		lista.add(new Portatil(2, "Portatil 2", "Placa 2", 32, 12, 2000));
		lista.add(new Sobremesa(3, "Sobremesa 1", "Placa 7", 64, "ATX", true));
		lista.add(new Portatil(4, "Portatil 3", "Placa 5", 64, 17, 3400));
		lista.add(new Sobremesa(5, "Sobremesa 2", "Placa 8", 64, "MICRO-ATX", false));
		/*
		fichero = "C:\\1713\\eclipse-workspace\\1713\\ordenadores.txt";

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));

		if (lista.size() > 0) {
			metaData = new MetaDato(lista.size());
			oos.writeObject(metaData);

		}
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
		int numeroObjetos = 0;
		// Mientras haya objetos
		if (aux instanceof MetaDato) {
			numeroObjetos = ((MetaDato) aux).getNumeroDeObjetos();

			if (numeroObjetos > 0) {
				for (int i = 0; i < numeroObjetos; i++) {
					lista.add((Alumno) ois.readObject());
					// System.out.println();
				}
			}
		}
		/*
		 * while (aux != null) { if () if (aux instanceof Alumno)
		 * System.out.println(aux); // Se escribe en pantalla el objeto
		 * ois.readObject();
		 * 
		 * }
		 
		ois.close();
		
		*/
	}

	public DAOOrdenadorArrayList(ArrayList<Object> lista, String fichero) {
		super();
		this.lista = lista;
		this.fichero = fichero;
	}

	@Override
	public List<Object> getAll() {
		return lista;
	}

	@Override
	public Object getById(int id) {
		Object resul = null;
		for (Object a : lista) {

			if (((Ordenador) a).getId() == id) {
				resul = a;
				break;
			}
		}
		return resul;
	}

	@Override
	public boolean insert(Object pojo) {
		return lista.add(pojo);
	}

	@Override
	public boolean delete(int id) {
		return lista.remove(this.getById(id));
	}

	@Override
	public boolean update(Object pojo) {
		boolean encontrado = false;

		for (Object ordenador : lista) {
			if (((Ordenador) ordenador).getId() == ((Ordenador) pojo).getId()) {
				ordenador = pojo;
				encontrado = true;
				break;
			}

		}

		return encontrado;
	}

}

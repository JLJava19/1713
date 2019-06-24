package com.ipartek.formacion.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.casa.examen.IOrdenableCPU;
import com.ipartek.formacion.casa.examen.Ordenador;
import com.ipartek.formacion.casa.examen.Portatil;
import com.ipartek.formacion.casa.examen.Sobremesa;

public class DAOOrdenadorArrayList implements IPersistible<Object> {

	private static final String FILE_NAME = "ordenadores.dat";
	private static DAOOrdenadorArrayList INSTANCE;
	private ArrayList<Object> lista;
	//private ArrayList<IOrdenableCPU> lista;
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

	/**
	 * Privado para que nadie pueda crear objetos
	 * 
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 */
	private DAOOrdenadorArrayList() throws FileNotFoundException, IOException, ClassNotFoundException {

		super();
		lista = new ArrayList<Object>();
		lista.add(new Portatil(1, "Portatil 1", "Placa 1", 64, 14, 3200));
		lista.add(new Portatil(2, "Portatil 2", "Placa 2",  32, 12, 2400));
		lista.add(new Sobremesa(3, "Sobremesa 1", "Placa 3", 64, "ATX", true));
		lista.add(new Sobremesa(4, "Sobremesa 2", "Placa 4", 32, "MICRO-ATX", false));
		lista.add(new Portatil(5, "Portatil 3", "Placa 5",  64, 17, 500));

		/*
		 * fichero = "C:\\1713\\eclipse-workspace\\1713\\personas.txt";
		 * 
		 * ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream(fichero));
		 * 
		 * for (int i = 0; i < lista.size(); i++) { // ojo, se hace un new por cada
		 * Persona. El new dentro del bucle.
		 * 
		 * oos.writeObject(lista.get(i)); }
		 * 
		 * oos.close(); // Se cierra al terminar.
		 * 
		 * // Vacio el array lista.clear();
		 * 
		 * ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
		 * 
		 * // Se lee el primer objeto Object aux = ois.readObject();
		 * 
		 * // Mientras haya objetos while (aux != null ) { if (aux instanceof Alumno)
		 * System.out.println(aux); // Se escribe en pantalla el objeto aux =
		 * ois.readObject(); } ois.close();
		 * 
		 */
		
		
		//desSeralizarLista();
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
		boolean resul = false;
		if ( pojo != null ) {
			resul = lista.add(pojo);
			if ( resul ) {
				serializarLista();
			}

		}
		return resul;

	}

	@Override
	public boolean delete(int id) {
		
		boolean resul = false;

		resul = lista.remove(this.getById(id));
		if ( resul ) {
			serializarLista();
		}
		return resul;


	}

	@Override
	public boolean update(Object pojo) {
		boolean encontrado = false;

		for (Object o : lista) {
			if (((Ordenador) o).getId() == ((Ordenador) pojo).getId()) {
				o = pojo;
				encontrado = true;
				break;
			}

		}

		return encontrado;
	}
	
	
	private void serializarLista() {

		try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME)) ){
			oos.writeObject(lista);
			oos.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}


	private void desSeralizarLista() {

		try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME)) ){	

			lista =  (ArrayList<Object>) ois.readObject();

		}catch (Exception e) {
			// e.printStackTrace();   EOF
		}
	}
}

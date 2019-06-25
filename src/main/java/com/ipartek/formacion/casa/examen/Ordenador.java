package com.ipartek.formacion.casa.examen;

import java.io.Serializable;

/**
 * Clase abstracta Ordenador
 * 
 * @author Jose
 *
 */

public abstract class Ordenador implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private String placaBase;
	private int cpu;
	
	/** Constructor
	 * 
	 * @param id
	 * @param nombre
	 * @param placaBase
	 * @param cpu
	 */
	
	public Ordenador(int id, String nombre, String placaBase, int cpu) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.placaBase = placaBase;
		this.cpu = cpu;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}

	public int getCpu() {
		return cpu;
	}

	public void setCpu(int cpu) {
		this.cpu = cpu;
	}



	@Override
	public String toString() {
		return "Ordenador [id=" + id + ", nombre=" + nombre + ", placaBase=" + placaBase + ", cpu=" + cpu + "]";
	}
	
	
	
	
		
}

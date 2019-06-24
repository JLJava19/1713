package com.ipartek.formacion.casa.examen;

import java.io.Serializable;

/**
 * Clase Portatil
 * 
 * 
 * @author Jose
 *
 */

public class Portatil extends Ordenador implements Serializable, IOrdenableCPU{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tamanyoPantalla;	// pulgadas
	private int bateria;	// mAh 
	

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param placaBase
	 * @param cpu
	 * @param tamanyoPantalla
	 * @param bateria
	 */
	public Portatil(int id, String nombre, String placaBase, int cpu, int tamanyoPantalla, int bateria) {
		super(id, nombre, placaBase, cpu);
		this.tamanyoPantalla = tamanyoPantalla;
		this.bateria = bateria;
	}


	public int getTamanyoPantalla() {
		return tamanyoPantalla;
	}


	public void setTamanyoPantalla(int tamanyoPantalla) {
		this.tamanyoPantalla = tamanyoPantalla;
	}


	public int getBateria() {
		return bateria;
	}


	public void setBateria(int bateria) {
		this.bateria = bateria;
	}


	@Override
	public String toString() {
		return "Portatil [tamanyoPantalla=" + tamanyoPantalla + ", bateria=" + bateria + "]";
	}


	@Override
	public int getValorCPU() {
		
		return this.getCpu();
	}
	
	
	
	
	
}

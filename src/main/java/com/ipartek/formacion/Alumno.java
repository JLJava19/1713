package com.ipartek.formacion;

/**
 * 
 * @author Curso
 *
 */

/*
 * hacer un constructor dende la persona por defecto va a tener nombre anoninmo,
 * edad 18, altura 0,peso 0, ojos marrone sexo y sobreescribir contructor para
 * poder crear una persona para indicar nombrem, edad y sexo
 */
public class Alumno extends Person implements Comparable<Alumno> {

	// atributos
	private int numVecesLeer;

	public Alumno() {
		super();
		this.numVecesLeer = 0;
	}
	
	public Alumno(String nombre) {
		super(nombre);
	}
	
	public Alumno(int id, String nombre) {
		super(nombre);
		super.setId(id);
	}
	
	public Alumno(String nombre, int edad, float altura, float peso, String ojos, char sexo) {
		super(nombre, edad, altura, peso, ojos, sexo);
		this.numVecesLeer = 0;

	}

	public Alumno(String nombre, int edad, char sexo) {
		super(nombre, edad, sexo);
		this.numVecesLeer = 0;

	}

	public int getNumVecesLeer() {
		return numVecesLeer;
	}

	public void setNumVecesLeer(int numVecesLeer) {
		this.numVecesLeer = numVecesLeer;
	}

	@Override
	public String toString() {
		return super.toString() + "Alumno [numVecesLeer=" + numVecesLeer + "]";
	}

	@Override
	public int compareTo(Alumno o) {
		// Ordenados de mayor a menor
		//return this.getNombre().compareTo(o.getNombre());
		
		// Ordenados por el numero de veces que han leido
		return o.getNumVecesLeer() - this.numVecesLeer;
	}

}

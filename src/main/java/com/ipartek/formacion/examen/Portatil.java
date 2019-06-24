package com.ipartek.formacion.examen;

public class Portatil extends Ordenador {
	
	private int tamanyoPantalla;	// En pulgadas
	private int bateria;	// En mAh


	


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
	
	
	
	

}

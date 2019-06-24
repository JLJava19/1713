package com.ipartek.formacion.examen;

public class Ordenador implements Comparable<Ordenador>{
	
	private int id;
	private String nombre;
	private String placaBase;	
	private int cpu;	// 64 or 32 bits
	
	
	
	
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




	@Override
	public int compareTo(Ordenador o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}

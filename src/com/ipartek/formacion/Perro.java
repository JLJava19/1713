package com.ipartek.formacion;

public class Perro {
	
	// atributos privados para encapsular
	private String nombre;
	private String raza;
	private int edad;
	private boolean vacunado;
	
	// constructores
	
	
	public Perro() {
		super();
		nombre = "Sin nombre";
		raza = "Cruce";
		edad = 0;
		vacunado = false;
	}
	
	
	
	public Perro(String nombre, String raza, int edad, boolean vacunado) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.vacunado = vacunado;
	}



	// getters and setters
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombr) {
		nombre = nombr;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	/**
	 * Setteamos la edad del perro, en caso de ser < 0 ponemos un 0
	 * @param edad int valor e años
	 */
	public void setEdad(int edad) throws Exception{
		if ( edad < 0 ) {
			// this.edad = 0;
			//throw new Exception("La edad no puede ser negativa");
			throw new PerroException(PerroException.ERROR_EDAD);
		}else {
			this.edad = edad;
		}
		
	}
	public boolean isVacunado() {
		return vacunado;
	}
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}
	
	
	
}

package com.ipartek.formacion;

import java.io.Serializable;

/**
 *  
 * @author Curso
 *
 */

/* hacer un constructor dende la persona por defecto va a tener nombre anoninmo, 
* edad 18, altura 0,peso 0, ojos marrone sexp i
* Sobreescribir contructor para poder crear una persona para indicar nombrem, edad 
* y sexo
*/
public class Person implements IAmigable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// atributos
	private int id;
	private String nombre;
	private int edad;
	private float altura; // 1.70 metros
	private float peso; // 50.5 kg
	private String ojos; // color
	private char sexo; // 'h' hombre 'm' mujer 'i' indefinido

	
	
	public Person() {
		super();
		
		this.setId(-1);
		this.nombre = "anonimo";
		this.edad = 18;
		this.altura = 0;
		this.peso = 0;
		this.ojos = "marrones";
		this.sexo = 'i';
	}
	
	public Person(String nombre) {
		super();
		
		this.setNombre(nombre);;

	}
	

	public Person(String nombre, int edad, float altura, float peso, String ojos, char sexo) {
		super();
		this.setId(-1);
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.ojos = ojos;
		this.sexo = sexo;
	}



	public Person(String nombre, int edad, char sexo) {
		//super();
		this();	// Llama al constructor Person() sin los parametros primero
		this.setId(-1);
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}



	public String saludar() {

		return "Hola me llamo " + this.nombre;
	}

	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			this.nombre = "Sin nombre";
		} else {
			this.nombre = nombre;
		}

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	// Listar Alumnos
	
	//crear alumno
	
	
	//Eliminar Alumno
	
	//Buscar voluntario, no puede ser el anterior
	
	//ranking
	
	//switch case

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", ojos="
				+ ojos + ", sexo=" + sexo + "]";
	}

	@Override
	public String despedir() {
		return "Agur";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}

package com.ipartek.formacion.utilidades;

import com.ipartek.formacion.Perro;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		
		// Metodos de instancia u objeto
		Perro p = new Perro();
		p.toString();
		
		// Metodos estaticos o de clase, obligatorio que sean 'static'
		Math.random();
		Calculadora.sumar(2, 3);
		
	}

}

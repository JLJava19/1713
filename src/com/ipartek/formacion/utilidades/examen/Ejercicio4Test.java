package com.ipartek.formacion.utilidades.examen;

import static org.junit.Assert.*;

import org.junit.Test;


public class Ejercicio4Test {

	@Test
	public void test() {

		Tren t1 = new Tren(1, 2, 400, 40);

		assertEquals("Se esperaba true", true, t1.estaLleno());
		assertEquals("Se esperaba FUERA DE CIRCULACI�N", "FUERA DE CIRCULACI�N", t1.demasiadoViejo());
		
		Tren t2 = new Tren(2, 23324, 340, 530);
		assertEquals("Se esperaba false", false, t2.estaLleno());
		assertEquals("Se esperaba FUERA DE CIRCULACI�N", "FUERA DE CIRCULACI�N", t2.demasiadoViejo());
		
		Tren t3 = new Tren(3, 34332, 10, 30);
		assertEquals("Se esperaba false", false, t3.estaLleno());
		assertEquals("Se esperaba EN CIRCULACI�N", "EN CIRCULACI�N", t3.demasiadoViejo());
	}

}

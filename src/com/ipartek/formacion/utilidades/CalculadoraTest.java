package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void sumar() {
		//fail("Not yet implemented");
		int resultado = Calculadora.sumar(2, 3);
		//assertEquals(5, resultado);
		
		assertEquals("No suma bien", 6, resultado);
		
		//assertTrue ( 2 == 2 );
	}
	
	@Test
	public void restar() {
		assertEquals(0, Calculadora.restar (2, 3));
		assertEquals(-1, Calculadora.restar (2, 3));
		assertEquals(1, Calculadora.restar (3, 3));
	}
	
	@Test
	public void multiplicar() {
		//fail("Not yet implemented");
		//Object o = null;
		//o.toString();
		
		assertEquals(4, Calculadora.multiplicar (2, 2));
		assertEquals(0, Calculadora.multiplicar (2, 0));
		assertEquals(0, Calculadora.multiplicar (0, 2));
		assertEquals(-4, Calculadora.multiplicar (2, -2));
	}
	
	@Test( expected = ArithmeticException.class )
	public void dividir() {
		assertEquals(2, Calculadora.dividir (2, 2));
		assertEquals(0, Calculadora.dividir (2, 0));
		assertEquals(0, Calculadora.dividir (0, 2));
		assertEquals(-5, Calculadora.dividir (2, -2));

	}

}

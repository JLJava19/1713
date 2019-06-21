package com.ipartek.formacion.utilidades.examen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class TrenTest {
	Tren tren;
	static final String TIPO = "Locomotora";
	static final String REFERENCIA = "LOC-123";
	static final int ASIENTOS_OCUPADOS = 5;
	static final int ANYOS = 3;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tren = new Tren(TIPO, REFERENCIA, ASIENTOS_OCUPADOS, ANYOS);
	}

	@After
	public void tearDown() throws Exception {
		tren = null;
	}

	@Test
	public void testTren() {
		assertEquals(TIPO, tren.getTipo());
		assertEquals(REFERENCIA, tren.getReferencia());
		assertEquals(ASIENTOS_OCUPADOS, tren.getAsientosOcupados());
		assertEquals(ANYOS, tren.getAnosActivo());

		Tren tNull = new Tren(null, null, 0, 0);
		assertEquals(null, tNull.getTipo());
		assertEquals(null, tNull.getReferencia());
		assertEquals(0, tNull.getAsientosOcupados());
		assertEquals(0, tNull.getAnosActivo());
	}

	@Test
	public void testGetTipo() {
		// fail("Not yet implemented");
		assertEquals(TIPO, "Locomotora");
	}

	@Test
	public void testSetTipo() {

		tren.setTipo("algo");
		assertEquals("algo", tren.getTipo());

		tren.setTipo(null);
		assertEquals(null, tren.getTipo());

	}

	@Test
	public void testGetReferencia() {
		assertEquals(REFERENCIA, tren.getReferencia());
	}

	@Test
	public void testSetReferencia() {
		tren.setReferencia("algo");
		assertEquals("algo", tren.getReferencia());

		tren.setReferencia(null);
		assertEquals(null, tren.getReferencia());
	}

	@Test
	public void testGetAsientosOcupados() {
		assertEquals(ASIENTOS_OCUPADOS, tren.getAsientosOcupados());
	}

	@Test
	public void testSetAsientosOcupados() {
		tren.setAsientosOcupados(-1);
		assertEquals(-1, tren.getAsientosOcupados());

		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA + 1);
		assertEquals(Tren.CAPACIDAD_MAXIMA + 1, tren.getAsientosOcupados());

	}

	@Test
	public void testGetAnosActivo() {
		assertEquals(ANYOS, tren.getAnosActivo());
	}

	@Test
	public void testSetAnosActivo() {
		tren.setAnosActivo(12);
		assertEquals(12, tren.getAnosActivo());
	}

	@Test
	public void testEstaLleno() {
		assertFalse(tren.estaLleno());

		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA);
		assertTrue(tren.estaLleno());

		tren.setAsientosOcupados(Tren.CAPACIDAD_MAXIMA + 1);
		assertTrue(tren.estaLleno());

	}

	@Test
	public void testDemasiadoViejo() {
		tren.setAnosActivo(54);
		assertTrue(tren.demasiadoViejo());
		
		tren.setAnosActivo(14);
		assertFalse(tren.demasiadoViejo());

	}

	@Ignore
	public void testMostrar() {
		fail("Not yet implemented");
	}

}

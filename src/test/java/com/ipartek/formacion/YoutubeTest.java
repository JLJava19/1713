package com.ipartek.formacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class YoutubeTest {
	Youtube yt;

	static final String TITULO = "EXPLORANDO CHERNOBYL";
	static final String CODIGO = "FwHlGL33rXA";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		yt = new Youtube(TITULO, CODIGO);
	}

	@After
	public void tearDown() throws Exception {
		yt = null;
	}

	@Test
	public void testYoutube() throws Exception {
		Youtube yNull;
		
		assertEquals(TITULO, yt.getTitulo());
		assertEquals(CODIGO, yt.getCodigo());
		assertEquals(0, yt.getReproducciones());
		
		try {
			yNull = new Youtube(null, null);
			fail("Constructor con NULLS, error controlado");
		} catch (Exception e) {
			//Para asegurarnos que entra por aquí
			yNull=null;
			assertTrue(true);
		}
		
		try {
			yNull = new Youtube(TITULO, "11");
			fail("Codigo <> 11");
		} catch (Exception e) {
			//Para asegurarnos que entra por aquí
			yNull=null;
			assertTrue(true);
		}
		
		try {
			yNull = new Youtube(" ", CODIGO);
			fail("Título incorrecto");
		} catch (Exception e) {
			//Para asegurarnos que entra por aquí
			yNull=null;
			assertTrue(true);
		}

	}

	@Test
	public void testGetTitulo() throws Exception {
		try {
			yt = new Youtube(null, CODIGO);
			fail("No se pueden introducir valores nulos");
		}catch (Exception e) {
			
		}
		yt = new Youtube("Un título", CODIGO);
		

	}

	@Test
	public void testSetTitulo() {
		//TODO Test titulo

	}

	@Test
	public void testGetCodigo() {
		assertEquals(TITULO, yt.getTitulo());
	}

	@Test
	public void testSetCodigo() throws Exception {

		try {
			yt = new Youtube(TITULO, "hdeyEnduQ13dq");
			fail("Codigo demasiado largo");
		} catch (Exception e) {

		}

		yt = new Youtube(TITULO, "hdeyEnduQ14");
	}

	@Test
	public void testGetReproducciones() throws Exception {
		yt.setReproducciones(3000);
		assertEquals(3000, yt.getReproducciones());
	}

	@Test
	public void testSetReproducciones() throws Exception {
		yt.setReproducciones(3000);
		assertEquals(3000, yt.getReproducciones());

		try {
			yt.setReproducciones(-1);
			fail("Error Negativo");
		} catch (Exception e) {

		}

		yt.setReproducciones(0);

		try {
			Youtube yt = new Youtube(TITULO, CODIGO);
			yt.setReproducciones(2123123);
		} catch (Exception e) {

		}

	}

	@Ignore
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetUrl() throws Exception {
		yt = new Youtube(TITULO, CODIGO);

		assertEquals("La url esta mal", Youtube.URL + yt.getCodigo(), yt.getUrl());

	}

}

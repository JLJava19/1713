package com.ipartek.formacion.colecciones;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		// String[] paises = new String[3];

		ArrayList<String> paises = new ArrayList<String>();

		assertTrue(paises.isEmpty());

		paises.add("Barakaldo");
		paises.add("EEUU");
		paises.add("Korea la buena");

		assertFalse(paises.isEmpty());

		// size
		assertEquals(3, paises.size());

		// insertar "Kuala Lumpur" entre "Barakaldo" y "EEUU"
		paises.add(1, "Kuala Lumpur");

		assertEquals("Barakaldo", paises.get(0));
		assertEquals("Kuala Lumpur", paises.get(1));
		assertEquals("EEUU", paises.get(2));

		// insertar "Barakaldo de nuevo" para comprobar que se puede repetir
		paises.add("Barakaldo");
		// probar a eliminar "Korea la buena"
		paises.remove(3);
		// assertTrue(paises.remove("Korea la buena"));
		assertNotEquals(3, "Korea la buena");

		// usar contais para saber si existe "Barakaldo" y "Korea la buena"

		int cont = 0;

		Iterator<String> it = paises.iterator();

		while (it.hasNext()) {
			String pais = it.next();
			if ("Barakaldo".equals(pais)) {
				cont++;
			}
		}

		assertEquals(2, cont);
		assertTrue(paises.contains("Barakaldo"));

		// probar a eliminar todo
		paises.clear();
		assertTrue(paises.isEmpty());
		
		paises.add("EEUU");
		paises.add("Korea la buena");
		paises.add("Barakaldo");
		
		// TODO mirar como ordeanar alfabeticamente
		Collections.sort(paises);
		
		assertEquals("Barakaldo", paises.get(0));
		assertEquals("EEUU", paises.get(1));
		assertEquals("Korea la buena", paises.get(2));
		
		// SOLO despues de usarel sort
		Collections.reverse(paises);
		assertEquals("Barakaldo", paises.get(2));
		assertEquals("EEUU", paises.get(1));
		assertEquals("Korea la buena", paises.get(0));
	}

}

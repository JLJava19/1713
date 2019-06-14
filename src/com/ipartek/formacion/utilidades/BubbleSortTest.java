package com.ipartek.formacion.utilidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

	
	@Test
	public void testOrdenar() throws Exception {
		int matriz[] = BubbleSort.ordenar(BubbleSort.matrizDesordenada);
		
		for (int i = 0; i < 10; i++) {
			assertEquals("Se esperaba" + i, i, matriz[i]);
		}

	}
	
	@Test
	public void testOrdenarExtra() throws Exception {
		//fail("Not yet implemented");
		int matriz[] = BubbleSort.ordenar(BubbleSort.matrizDesordenadaExtra);
		
		int [] aOrdenado = {-4, -3, 0, 1, 6, 17, 18, 22, 35, 49};
		
		assertEquals("Se esperaba -4", -4, matriz[0]);
		assertEquals("Se esperaba -3", -3, matriz[1]);
		assertEquals("Se esperaba 0", 0, matriz[2]);
		assertEquals("Se esperaba 1", 1, matriz[3]);
		assertEquals("Se esperaba 6", 6, matriz[4]);
		assertEquals("Se esperaba 17", 17, matriz[5]);
		assertEquals("Se esperaba 18", 18, matriz[6]);
		assertEquals("Se esperaba 22", 22, matriz[7]);
		assertEquals("Se esperaba 35", 35, matriz[8]);
		assertEquals("Se esperaba 49", 49, matriz[9]);

		assertArrayEquals("No son iguales", aOrdenado, matriz);

	}
	
	@Test
	public void testOrdenarExtraDos() throws Exception {
		//fail("Not yet implemented");
		int matriz[] = BubbleSort.ordenar(BubbleSort.matrizDesordenadaExtraDos);
		
		assertEquals("Se esperaba -4", -4, matriz[0]);
		assertEquals("Se esperaba -3", -3, matriz[1]);
		assertEquals("Se esperaba 0", 0, matriz[2]);
		assertEquals("Se esperaba 1", 1, matriz[3]);
		assertEquals("Se esperaba 6", 6, matriz[4]);
		assertEquals("Se esperaba 17", 17, matriz[5]);
		assertEquals("Se esperaba 18", 18, matriz[6]);
		assertEquals("Se esperaba 22", 22, matriz[7]);
		assertEquals("Se esperaba 35", 35, matriz[8]);
		assertEquals("Se esperaba 78", 78, matriz[10]);



	}

}

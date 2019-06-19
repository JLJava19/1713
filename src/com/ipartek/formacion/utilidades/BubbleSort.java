package com.ipartek.formacion.utilidades;


/**
 * 
 * @author Curso
 *
 */
public class BubbleSort {

	public static int[] matrizDesordenada = { 8, 0, 1, 3, 7, 2, 5, 4, 6, 9 };
	public static int[] matrizDesordenadaExtra = { 18, 0, 1, -3, 17, 22, 35, -4, 6, 49 };
	public static int[] matrizDesordenadaExtraDos = { 18, 0, 1, -3, 17, 22, 35, -4, 6, 49 ,78};
	
	public static final int ELEMENTOS_MATRIZ = 10;
	
	/**
	 * 
	 * @param matriz
	 * @return
	 * @throws Exception Si se le pasa un array mayor que ELEMENTOS_MATRIZ
	 */
	public static int[] ordenar(int matriz[]) throws Exception {
		int menor;
		int mayor;
		
		if (matriz == null) {
			throw new Exception("Matriz nula");
		}
		
		int[] matrizOrdenada = new int[ELEMENTOS_MATRIZ];
		
		try {
			// for (int i = 0; i < matriz.length; i++) {
			for (int i = 0; i < ELEMENTOS_MATRIZ; i++) {
				// for (int j = i; j < 10; j++) {
				for (int j = i; j < ELEMENTOS_MATRIZ; j++) {
					if (matriz[i] > matriz[j]) {
						menor = matriz[j];
						mayor = matriz[i];
						matriz[i] = menor;
						matriz[j] = mayor;
					} // If
				} // For
			} // For
			
			matrizOrdenada = matriz;
		} catch (ArrayIndexOutOfBoundsException e) {
			
			throw new Exception("Solo puedes pasar un array de maximo 10 elementos");
		}
		

		return matrizOrdenada;
	}

}

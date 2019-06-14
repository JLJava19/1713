package com.ipartek.formacion.utilidades;


/**
 * 
 * @author Curso
 *
 */
public class CalculadoraDevolucion {

	public static final float[] BILLETES_MONEDAS = {
			// Billetes
			500, 200, 100, 50, 20, 10, 5, 2, 1,
			// Monedas
			0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	/**
	 * Calcula las vueltas optimas para retornar el menor numero de billetes y
	 * monedas
	 * 
	 * @param importe   float costo del articulo a comprar
	 * @param entregado float dinero entrega para comprar
	 * @return int[] cantidad de billetes y monedas retornadas
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception importe > entregado o si importe < 0 o entregado < 0
	 */
	public static int[] vueltas(float importe, float entregado) throws Exception {
		
		float devolver;
		int[] devolverDinero = new int[BILLETES_MONEDAS.length];
		
		if (importe > entregado || entregado < 0)
		{
			throw new Exception("El importe del producto es mayor");
		}else if (importe < 0) {
			throw new Exception("El importe es negativo");
			
		}else if (importe == entregado) {
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				devolverDinero[i] = 0;			
			}
			
		}else {
			devolver = entregado - importe;
			for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
				
				if (BILLETES_MONEDAS[i] > devolver) {
					devolverDinero[i] = 0;
				} else {
					devolverDinero[i] = (int) (devolver / BILLETES_MONEDAS[i]);
					
					//devolver = devolver % BILLETES_MONEDAS[i];
					devolver = ((float) Math.round(devolver * 100) / 100) % BILLETES_MONEDAS[i];
					
				}
				
			}
			
		}
		
		
		
		
		//boolean importeCorrecto = false;

		

		return devolverDinero;
	}
}

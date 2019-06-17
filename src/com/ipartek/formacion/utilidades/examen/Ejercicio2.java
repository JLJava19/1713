package com.ipartek.formacion.utilidades.examen;

import java.util.Scanner;

/**
 * Ejercicio que nos dice si tenemos posibilidad de ganar el campeonato
 * de automobilismo.
 * 
 * @author Jose
 *
 */
public class Ejercicio2 {

	final static int PUNTUACION = 70;
	
	public static void main(String[] args) {

		int puntuacion = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Que puntos has obtenido? \n");
		puntuacion = Integer.parseInt(sc.next());

		if (ganar(puntuacion)) {
			System.out.println("Puedes ganar el campeonato");
		}else {
			System.out.println("Ponte las pilas si quieres ganar");
		}
		
		sc.close();
	}

	
	/**
	 * Función GANAR
	 * 
	 * @param puntos int - Los puntos obtenidos en el campeonato
	 * @return true si puntos >= PUNTUACION, else false
	 */
	static boolean ganar(int puntos) {
		boolean resultado = false;
		if (puntos >= PUNTUACION)
			resultado = true;
		return resultado;
	}

}

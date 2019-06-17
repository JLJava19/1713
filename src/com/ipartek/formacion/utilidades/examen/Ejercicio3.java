package com.ipartek.formacion.utilidades.examen;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Pedir 10 numeros por teclado y guardarlo en un array llamado DATOS
 * 
 * Mostrar los múltiplos de 7
 * Obtener la media con 2 decimales
 * 
 * @author Jose
 *
 */
public class Ejercicio3 {
	// Array de 10 números llamado DATOS
	final static int MAX_NUMEROS = 10;
	static int[] aNumeros = new int[MAX_NUMEROS];
	
	public static void main(String[] args) {
		
		int contador = 0;
		int sumaArray = 0;
		float resultadoMedia;
		
		NumberFormat formateado = new DecimalFormat("#.##");  
		
		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.println("Escribe un numero \n");
			aNumeros[contador] = Integer.parseInt(sc.next());

			contador += 1;
			
		} while (contador < aNumeros.length);

		// Múltiplos de 7
		for (int i = 0; i < aNumeros.length; i++) {

			if (aNumeros[i] % 7 == 0) {
				System.out.printf("El número %d es múltiplo de 7 \n", aNumeros[i]);
			}

			sumaArray += aNumeros[i];
		}
		
		resultadoMedia = ((float) Math.round(sumaArray * 100) / 100) / aNumeros.length;
		
		System.out.printf("La media es %.2f", resultadoMedia);
		System.out.printf("\n\n\n");
		System.out.println(formateado.format(resultadoMedia));
		sc.close();
	}

}

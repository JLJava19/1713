package com.ipartek.formacion.utilidades.examen;

//import java.text.DecimalFormat;
//import java.text.NumberFormat;
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

	public static void main(String[] args) {
		// Array de 10 números llamado DATOS
		int[] datos = new int[10];
		int contador = 0;
		int sumaArray = 0;
		float resultadoMedia;
		
		//NumberFormat formateado = new DecimalFormat("#0.00");  
		
		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.println("Escribe un numero \n");
			datos[contador] = Integer.parseInt(sc.next());

			contador += 1;
			
		} while (contador < datos.length);

		// Múltiplos de 7
		for (int i = 0; i < datos.length; i++) {

			if (datos[i] % 7 == 0) {
				System.out.printf("El número %d es múltiplo de 7 \n", datos[i]);
			}

			sumaArray += datos[i];
		}
		
		resultadoMedia = ((float) Math.round(sumaArray * 100) / 100) / datos.length;
		
		System.out.printf("La media es %.2f", resultadoMedia);
		//System.out.println(formateado.format(4.0));
		sc.close();
	}

}

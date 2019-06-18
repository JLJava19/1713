package com.ipartek.formacion.utilidades.examen;

import java.util.Scanner;

/**
 * 
 * @author Jose
 *
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		// Variables
		String tipo = "";
		String referencia = "";
		int numeroAsientos = 0;
		int anosActivo = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Tipo de tren \n");
		tipo = sc.nextLine();

		System.out.println("Referencia \n");
		referencia = sc.nextLine();

		System.out.println("Numero de asientos \n");
		numeroAsientos = Integer.parseInt(sc.next());

		System.out.println("Años activo \n");
		anosActivo = Integer.parseInt(sc.next());

		Tren t1 = new Tren(tipo, referencia, numeroAsientos, anosActivo);

		if (t1.estaLleno()) {
			System.out.println("El tren esta lleno");
		} else {
			System.out.println("Hay plazas disponibles");
		}
		
		//System.out.println(t1.demasiadoViejo());
		if (t1.demasiadoViejo()) {
			System.out.println("FUERA DE CIRCULACIÓN");
		}else {
			System.out.println("EN CIRCULACIÓN");
		}
		
		System.out.println(t1.mostrar());

		sc.close();
	}

}

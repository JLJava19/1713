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
		int tipo = 0;
		int referencia = 0;
		int numeroAsientos = 0;
		int anosActivo = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Tipo de tren \n");
		tipo = Integer.parseInt(sc.next());

		System.out.println("Referencia \n");
		referencia = Integer.parseInt(sc.next());

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
		
		System.out.println(t1.demasiadoViejo());

		t1.mostrar();

		sc.close();
	}

}

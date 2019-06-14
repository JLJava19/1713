package com.ipartek.formacion.utilidades;

import java.util.Scanner;

public class JugarAhorcado {

	public static void main(String[] args) {
		// Crear un a partida
		int intentos = Ahorcado.INTENTOS;
		char caract = '_';
		boolean acierto = false;
		
		Ahorcado a = new Ahorcado();
		System.out.println("*********** El ahorcado *********** \n");
		System.out.println("Tienes " + intentos + "\n\n");
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Escribe un caracter: \n");
			
			caract = sc.next().charAt(0);

			if (a.jugar(caract)) {
				System.out.println("Muy bien \n");

			} else {
				System.out.println("Muy mallllll \n");
				intentos = intentos - 1;
			}

			System.out.println(a.mostrarResultado());
			
			acierto = a.comprobar();
			
			if (intentos == 0 && !acierto)
			{
				System.out.println("SE ACABO, HAS PERDIDO");
				
			}
		} while (intentos > 0 && !acierto);

		sc.close();
	}

}

package com.ipartek.formacion.utilidades;

import java.util.Scanner;

public class Ahorcado {
	public static final int INTENTOS = 7;

	private char[] palabra = { 'v', 'i', 'e', 'r', 'n', 'e', 's' };
	private char[] palabraBuscar = new char[palabra.length];

	public Ahorcado() {
		super();
		for (int i = 0; i < palabraBuscar.length; i++) {
			this.palabraBuscar[i] = '_';
		}
	}

	private boolean comprobrarCaracter(char caracter) {

		boolean encontrado = false;

		// boolean[] encontrados = new boolean [palabra.length];

		for (int i = 0; i < palabra.length; i++) {
			if (palabra[i] == caracter) {
				setPalabraBuscar(caracter, i);
				encontrado = true;
				// break;
			}
		}

		return encontrado;
	}

	private String mostrarResultado() {
		String palabra = "";

		for (int i = 0; i < palabraBuscar.length; i++) {
			palabra = palabra + " " + palabraBuscar[i];
		}

		return palabra;
	}

	private boolean comprobar() {

		boolean exacto = true;

		for (int i = 0; i < palabraBuscar.length; i++) {
			if (palabraBuscar[i] == '_') {
				exacto = false;
			}

		}

		return exacto;
	}
	
	

	public void jugar( ) {
		int intentos = INTENTOS;
		char caract = '_';
		
		boolean acierto = false;
		
		Scanner sc = new Scanner(System.in);
		
		do {

			System.out.println("Escribe un caracter: \n");

			caract = sc.next().charAt(0);
			caract = Character.toLowerCase(caract);
			
			if (comprobrarCaracter(caract)) {
				System.out.println("Muy bien \n");

			} else {
				System.out.println("Muy mallllll \n");
				intentos = intentos - 1;
			}

			System.out.println(mostrarResultado());

			acierto = comprobar();

			
		} while (intentos > 0 && !acierto);
		
		if (intentos == 0 && !acierto) {
			System.out.println("SE ACABO, HAS PERDIDO");

		}else {
			System.out.println("Felicidades!!!!!");
		}
		
		sc.close();
	}

//*******************************************************************************

	public void setPalabraBuscar(char caracterBuscar, int posicion) {

		this.palabraBuscar[posicion] = caracterBuscar;
	}


}

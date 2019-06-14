package com.ipartek.formacion.utilidades;

import java.util.Scanner;

public class JugarAhorcado {

	public static void main(String[] args) {
		// Crear un a partida
		/*
		int intentos = Ahorcado.INTENTOS;
		char caract = '_';
		boolean acierto = false;
		*/
		
		Ahorcado a = new Ahorcado();
		System.out.println("*********** El ahorcado *********** \n");
		System.out.println("Tienes " + Ahorcado.INTENTOS + "\n\n");
		
		
		
		a.jugar( );

		
	}

}

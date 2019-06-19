package com.ipartek.formacion.utilidades;


public class JugarAhorcado {

	public static void main(String[] args) {
		// Crear un a partida

		
		Ahorcado a = new Ahorcado();
		System.out.println("*********** El ahorcado *********** \n");
		System.out.println("Tienes " + Ahorcado.INTENTOS + "\n\n");
		
		
		
		a.jugar( );

		
	}

}

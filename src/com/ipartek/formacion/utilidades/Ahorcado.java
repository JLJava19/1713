package com.ipartek.formacion.utilidades;

public class Ahorcado {
	public static final int INTENTOS = 7;

	private char [] palabra = {'v', 'i', 'e', 'r', 'n', 'e', 's'};
	public char [] palabraBuscar = new char[palabra.length];
	
	
	
	public Ahorcado() {
		super();
		for (int i = 0; i < palabraBuscar.length; i++) {
			this.palabraBuscar[i] = '_';
		}
	}



	public boolean jugar(char caracter) {
			
		boolean encontrado = false;
		
		for (int i = 0; i < palabra.length; i++) {
			if ( palabra[i] == caracter) {
				setPalabraBuscar (caracter, i);
				encontrado = true;
			}			
		}
		
		return encontrado;
	}

	public String  mostrarResultado() {
		String palabra = "";
		
		for (int i = 0; i < palabraBuscar.length; i++) {
			palabra = " " + palabraBuscar[i] + " ";
		}
		
		return palabra;
	}
	

	public char[] getPalabraBuscar() {
		return palabraBuscar;
	}

	public boolean comprobar (  )	{
		
		boolean exacto = true;
		
		for (int i = 0; i < palabraBuscar.length; i++) {
			if ( palabraBuscar[i] == '_' ) {
				exacto = false;
			}
			
		}
		
		return exacto;
	}


	public void setPalabraBuscar(char caracterBuscar, int posicion) {
		
		this.palabraBuscar[posicion] = caracterBuscar;
	}
	
	
	
}

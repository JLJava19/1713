package com.ipartek.formacion;

public abstract class ObjetoGrafico {

	// atributos...
	
	// constructores...
	
	
	public void mover (int x, int y) {
		
		System.out.println("Movemos el objeto a la nueva posicion");
	}
	
	public abstract void dibujar();	// Prototipo o funcion sin implementar
}

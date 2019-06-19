package com.ipartek.formacion;

public class DibujarCirculosTriangulos {

	public static void main(String[] args) {

		Circulo c = new Circulo();
		c.dibujar();
		
		// Triangulo t = new Triangulo(); No deja, es abstracto
		Triangulo t = new TrianguloEquilatero();
		t.dibujar();
	}

}

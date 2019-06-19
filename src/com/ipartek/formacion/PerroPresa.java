package com.ipartek.formacion;

public class PerroPresa extends Perro {
	public void atacar() {
		super.raza = "RAzaaa";
		Perro p = new Perro();
		p.chip = "xcs-123";
		System.out.println("Grrrrrrrrr que te muerdo");
		
	}

	@Override
	public void ladrar() {
		System.out.println("");;
	}
}

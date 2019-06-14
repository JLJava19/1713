package com.ipartek.formacion.exception;

public class PropagacionException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Comienza Main");
		metodoA();
		System.out.println("Termina Main");
	}
	
	private static void metodoA() {
		System.out.println("Comienza metodo A");
		//metodoB();
		Perro p = new Perro();
		
		System.out.println("Termina metodo A");
	}
	
	private static void metodoB() {
		System.out.println("Comienza metodo B");
		
		System.out.println("Termina metodo B");
	}
	

}

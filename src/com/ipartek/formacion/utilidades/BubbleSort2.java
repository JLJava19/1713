package com.ipartek.formacion.utilidades;


public class BubbleSort2 {

	public static void main(String[] args) {
		
		int[] matrizDesordenada = {8, 0, 1, 3, 7, 2, 5, 4, 6, 9};
		int menor;
		int mayor;
		
		for (int i = 0; i < matrizDesordenada.length; i++) {
			for (int j = i; j < matrizDesordenada.length; j++) {
				if(matrizDesordenada[i] > matrizDesordenada[j]) {
					menor=matrizDesordenada[j];
					mayor=matrizDesordenada[i];
					matrizDesordenada[i] = menor;
					matrizDesordenada[j] = mayor;
				}
			}
		}
		
	}
	
	
}

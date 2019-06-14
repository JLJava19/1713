package com.ipartek.formacion.exception;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bandera;
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int resultado= 0;
		
		
		// Controlar que el primer numero sea correcto
		do {
				
			try {

				System.out.println("Escribe un numero \n");

				String sNumero1 = sc.nextLine();

				n1 = Integer.parseInt(sNumero1);
				
				bandera = false;

			} catch (Exception e) {

				//System.out.println(e.getMessage());
				System.out.println("No has introducido un numero");
				bandera = true;

			} 
			
			
			
		} while (bandera);
		
		// Controlar que el segundo numero sea correcto
		
		do {
			
			try {

				System.out.println("Escribe otro numero \n");
				String sNumero2 = sc.nextLine();

				n2 = Integer.parseInt(sNumero2);
				
				bandera = false;

			} catch (Exception e) {

				//System.out.println(e.getMessage());
				System.out.println("No has introducido un numero");
				bandera = true;

			} 
			
			
			
		} while (bandera);
		
		
		
		// Mostrar la suma de los dos numeros
		
		
		// Probando ArithmeticException
		try {
			resultado = n1 / n2;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error de aritmetica");
		}
		

		System.out.println("La suma es " + resultado);
		
		sc.close();
	}
}

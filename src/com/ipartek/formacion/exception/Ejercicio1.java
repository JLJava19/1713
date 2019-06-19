package com.ipartek.formacion.exception;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Comienza programa");

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor introduce un numero del 0 al 9 \n");

		try {
			// Usar siempre mejor esto y no nextInt, nextChar
			String sNumero = sc.nextLine();

			int numero = Integer.parseInt(sNumero);

			System.out.println("Su numero es " + numero);

			System.out.println("Termina programa");
		} catch (Exception e) {
			
			System.out.println("Mensaje Exception" + e.getMessage());
			
			// Se pone en un log
			e.printStackTrace();
			
			System.out.println("Te dijo un numero!!! Que si no falla");

		} finally {
			sc.close();
		}
	}

}

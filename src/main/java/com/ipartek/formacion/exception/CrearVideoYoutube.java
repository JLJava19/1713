package com.ipartek.formacion.exception;

import java.util.Scanner;

import com.ipartek.formacion.Youtube;

public class CrearVideoYoutube {

	public static void main(String[] args) {
		boolean repetir = true;
		Youtube video = null;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			// Crear VIDEO YOUTUBE
			
			System.out.println("---------------- Crear VIDEO YOUTUBE ---------------- \n");
			

			System.out.println("Titulo del video, recuerda longitud [2, 150]: ");
			String titulo = sc.nextLine();

			System.out.println("Codigo del video, recuerda longitud [11]: ");
			String codigo = sc.nextLine();

			try {
				video = new Youtube(titulo, codigo);
				repetir = false;
			} catch (Exception e) {
				System.out.println("El error es " + e.getMessage());
				repetir = true;
			}


		} while (repetir);
		
		if (repetir) {
			System.out.println("Video creado correctamente");
			System.out.println(video);

			sc.close();
		}
		
	}

}

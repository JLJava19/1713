package com.ipartek.formacion.ejercicios.generales;


public class NumeroPerfecto {

	public static void main(String[] args) {

		int suma = 0;
		int i = 0;
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		numero = sc.nextInt();
		
		i = numero - 1;
		
		while(i > 0)
		{
			if ( numero % i == 0)
			{
				suma += i;
			}
			i--;
		}
		
		System.out.println( ( numero == suma ) ? "Es un numero perfecto" : "No es un numero perfecto");
		
		*/

		for (int j = 1000; j > 0; j--) {
			suma = 0;
			i = j - 1;
			while(i > 0)
			{
				if ( j % i == 0)
				{
					suma += i;
				}
				i--;
			}
			
			if ( j == suma ) {
				System.out.printf("***Es un numero perfecto el numero %d*** \n", suma);
			}
			//System.out.println( ( numero == suma ) ? "Es un numero perfecto" : "No es un numero perfecto");
			//i = j;
		}
		
		
		// sc.close();
	}

}

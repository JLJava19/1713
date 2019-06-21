package com.ipartek.formacion;

import java.text.DecimalFormat;

public class PersonasMasRicas {

	public static void main(String[] args) {
		

		Person p1 = new Person();
		System.out.println(p1);

		Person p2 = new Person("Pepito", 20, (float) 1.74, (float) 76.4, "azul", 'm');
		System.out.println(p2);

		Employee e1 = new Employee();
		System.out.println(e1);

		Employee e2 = new Employee("Amancio Ortega Gaona", 82, 'm', 50400, new java.util.Date(), (float) 1000);
		System.out.println(e2);

		Employee e3 = new Employee("Rafael Del Pino y familia", 60, 'm', 7650, new java.util.Date(), 900f);
		System.out.println(e3);

		Employee e4 = new Employee("Juan Roig Alfonso y familia", 69, 'm', 7050, new java.util.Date(), (float) 800);
		System.out.println(e4);

		Employee[] youtubers = new Employee[3];

		Employee y1 = new Employee("Logan Paul", 23, 'm', 50400, new java.util.Date(), 14500000f);
		Employee y2 = new Employee("PewDiePie", 23, 'm', 50400, new java.util.Date(), 15500000f);
		Employee y3 = new Employee("Jackspticeye", 23, 'm', 50400, new java.util.Date(), 16500000f);

		youtubers[0] = y1;
		youtubers[1] = y2;
		youtubers[2] = y3;

		// numero nombre
		
		Employee emp = null;
		DecimalFormat dc = new DecimalFormat("##,###,### $");
		for (int i = 0; i < youtubers.length; i++) {

			// System.out.println( (i + 1) + " " + youtubers[i].getNombre() + " " +
			// youtubers[i].getSalario() + " \n"); System.out.printf( (i + 1) + " " +
			// youtubers[i].getNombre() + " " + youtubers[i].getSalario() + " \n");
			emp = youtubers[i];
			// Currency c = new Currency();
			// c.getSymbol(locale)
			//System.out.printf("%d %s - %.2f $ \n", (i + 1), youtubers[i].getNombre(), youtubers[i].getSalario());
			
			System.out.printf("%d %s - %s \n", (i + 1), emp.getNombre(),  dc.format(emp.getSalario()) );
		}
		
		for (Employee employee : youtubers) {
			
			System.out.println(employee);
			
		}

	}

}

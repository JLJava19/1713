package com.ipartek.formacion.exception;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;
/**
 * Se puede capturar mas de un tipo de Excepciones.
 * Siempre la ultima en capturar que sea 
 * @author Curso
 *
 */
public class CapturarTiposExcepciones {

	public static void main(String[] args) {
		
		try {
			//Perro p = null;
			Perro p = new Perro ();
			p.setEdad(1);
			p.toString();
			System.out.println(p);
			
			Perro p2 = new Perro ();
			
			Perro[] perros = new Perro[2];
			
			perros[3] = p2;
			
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Fuera de array");	
		} catch (PerroException e) {
			// TODO: handle exception
			System.out.println("PerroException Null");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Excepcion Null");	
		} catch (Exception e) {
			// Este catch siempre el ultimo
			System.out.println("Excepcion generica, siempre la ultima");
			e.printStackTrace();
		}
		
	}
}

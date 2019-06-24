package com.ipartek.formacion.examen;

import java.util.Comparator;



public class ComparatorCPU implements Comparator<Ordenador>{

	@Override
	public int compare(Ordenador o1, Ordenador o2) {
		
		
		return o1.getNombre().compareTo( o2.getNombre() );

	}

}

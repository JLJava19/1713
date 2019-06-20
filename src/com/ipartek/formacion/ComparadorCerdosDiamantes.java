package com.ipartek.formacion;

import java.util.Comparator;

public class ComparadorCerdosDiamantes implements Comparator<IOrdenable> {


	@Override
	public int compare(IOrdenable o1, IOrdenable o2) {
		return o1.getValor() - o2.getValor();
	}

}
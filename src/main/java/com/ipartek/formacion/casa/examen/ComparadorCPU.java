package com.ipartek.formacion.casa.examen;

import java.util.Comparator;

import com.ipartek.formacion.casa.examen.IOrdenableCPU;

public class ComparadorCPU  implements Comparator<IOrdenableCPU> {

	@Override
	public int compare(IOrdenableCPU o1, IOrdenableCPU o2) {
		return o1.getValorCPU() - o2.getValorCPU();
	}

}

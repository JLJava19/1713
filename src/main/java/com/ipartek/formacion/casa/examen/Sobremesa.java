package com.ipartek.formacion.casa.examen;

import java.io.Serializable;

public class Sobremesa extends Ordenador implements Serializable, IOrdenableCPU{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoTorre;
	private boolean grabadora;
	
	
	public Sobremesa(int id, String nombre, String placaBase, int cpu, String tipoTorre, boolean grabadora) {
		super(id, nombre, placaBase, cpu);
		this.tipoTorre = tipoTorre;
		this.grabadora = grabadora;
	}


	public String getTipoTorre() {
		return tipoTorre;
	}


	public void setTipoTorre(String tipoTorre) {
		this.tipoTorre = tipoTorre;
	}


	public boolean getGrabadora() {
		return grabadora;
	}


	public void setGrabadora(boolean grabadora) {
		this.grabadora = grabadora;
	}


	@Override
	public String toString() {
		return "Sobremesa [tipoTorre=" + tipoTorre + ", grabadora=" + grabadora + "]";
	}
	
	@Override
	public int getValorCPU() {		
		return this.getCpu();
	}
	

}

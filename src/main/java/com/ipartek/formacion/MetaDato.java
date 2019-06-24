package com.ipartek.formacion;

import java.io.Serializable;

public class MetaDato implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numeroDeObjetos;

	public MetaDato(int numeroDeObjetos) {
		super();
		this.numeroDeObjetos = numeroDeObjetos;
	}
	
	public MetaDato() {
		super();
		this.numeroDeObjetos = 0;
	}

	public int getNumeroDeObjetos() {
		return numeroDeObjetos;
	}

	public void setNumeroDeObjetos(int numeroDeObjetos) {
		this.numeroDeObjetos = numeroDeObjetos;
	}

	@Override
	public String toString() {
		return "MetaDato [numeroDeObjetos=" + numeroDeObjetos + "]";
	}
	
	

}

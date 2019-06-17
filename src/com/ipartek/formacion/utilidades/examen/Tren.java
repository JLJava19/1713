package com.ipartek.formacion.utilidades.examen;

/**
 * Clase Tren
 * 
 * @author Jose
 *
 */

public class Tren {

	private int tipo;
	private int referencia;
	private int asientosOcupados;
	private int anosActivo;

	//Constructores
	
	public Tren() {
		super();
	}

	public Tren(int tipo, int referencia, int asientosOcupados, int anosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.anosActivo = anosActivo;
	}
	
	//Métodos
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getAnosActivo() {
		return anosActivo;
	}

	public void setAnosActivo(int anosActivo) {
		this.anosActivo = anosActivo;
	}

	public boolean estaLleno() {
		boolean lleno = false;

		if (getAsientosOcupados() >= 400) {
			lleno = true;
		}

		return lleno;
	}
	
	public String demasiadoViejo() {
		String mensaje="";
		
		if (getAnosActivo() >=40) {
			mensaje = "FUERA DE CIRCULACIÓN";
		}else {
			mensaje = "EN CIRCULACIÓN";
		}
		
		return mensaje;
	}


	public String mostrar() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientosOcupados=" + asientosOcupados
				+ ", anosActivo=" + anosActivo + "]";
	}
	
	
}

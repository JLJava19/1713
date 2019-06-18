package com.ipartek.formacion.utilidades.examen;

/**
 * Clase Tren
 * 
 * @author Jose
 *
 */

public class Tren {

	static final int CAPACIDAD_MAXIMA = 400;
	static final int EDAD_MAXIMA = 40;

	private String tipo;
	private String referencia;
	private int asientosOcupados;
	private int anosActivo;

	// Constructores

	public Tren() {
		super();
	}

	public Tren(String tipo, String referencia, int asientosOcupados, int anosActivo) {
		super();
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.anosActivo = anosActivo;
	}

	// Métodos

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
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

	/**
	 * 
	 * 
	 * @see CAPACIDAD_MAXIMA
	 * @return true si el tren esta lleno
	 */

	public boolean estaLleno() {
		boolean lleno = false;

		if (getAsientosOcupados() >= CAPACIDAD_MAXIMA) {
			lleno = true;
		}

		return lleno;
	}

	public boolean demasiadoViejo() {
		/*
		String mensaje = "";

		if (getAnosActivo() >= EDAD_MAXIMA) {
			mensaje = "FUERA DE CIRCULACIÓN";
		} else {
			mensaje = "EN CIRCULACIÓN";
		}

		return mensaje;
		*/
		
		boolean jubilado = false;

		if (getAnosActivo() >= EDAD_MAXIMA) {
			jubilado = true;
		}

		return jubilado;
	}

	public String mostrar() {
		return "Tren [tipo=" + getTipo() + ", referencia=" + getReferencia() + ", asientosOcupados="
				+ getAsientosOcupados() + ", anosActivo=" + getAnosActivo() + "]";
	}

}

package com.ipartek.formacion;
/**
 * 
 * @author Curso
 *
 */
public class Youtube {

	private static final int LONGITUD_CODIGO = 11;
	private static final int LONGITUD_MIN_TITULO = 2;
	private static final int LONGITUD_MAX_TITULO = 150;
	private static final String URL = "https://www.youtube.com/watch?v=";
	// Propiedades
	
	private String titulo;
	private String codigo;
	private int reproducciones;
	
	
	// Constructores
	
	public Youtube(String titulo, String codigo) throws Exception {
		super();
		//this.titulo = titulo;	// minimo 2 letras, maximo 150
		//this.codigo = codigo;	// exactamente 11
		this.setTitulo(titulo);
		this.setCodigo(codigo);
		this.reproducciones = 0;
	}
	
	// Getters y setters
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) throws Exception {
		if ( titulo != null && titulo.length() >= LONGITUD_MIN_TITULO && titulo.length() <= LONGITUD_MAX_TITULO ) {
			this.titulo = titulo;
		}else {
			String msg= String.format("Titulo debe tener longitud entre %d y %d", LONGITUD_MIN_TITULO, LONGITUD_MAX_TITULO);
			throw new Exception( msg );
		}
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) throws Exception {
		if ( codigo!= null && codigo.length() == LONGITUD_CODIGO) {
			this.codigo = codigo;	
		}else {
			throw new Exception("Longitud codigo debe ser 11");
		}
		
		
	}
	public int getReproducciones() {
		return reproducciones;
	}
	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}
	
	
	
	
	// funciones
	
	@Override
	public String toString() {
		return "Youtube [titulo=" + titulo + ", codigo=" + codigo + ", reproducciones=" + reproducciones + "]";
	}
	
	public String getUrl() {
		return URL + codigo;
	}
	
}

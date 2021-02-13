package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Lavadora {
	
	private int libras;
	private String ciclosLavado;
	private String tipo;
	
	public int getLibras() {
		return libras;
	}

	public void setLibras(int libras) {
		this.libras = libras;
	}

	public String getCiclosLavado() {
		return ciclosLavado;
	}

	public void setCiclosLavado(String ciclosLavado) {
		this.ciclosLavado = ciclosLavado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

		
	/**
	 * 
	 */
	public Lavadora() {
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int libras, String ciclosLavado, String tipo) {
		super();
		this.libras = libras;
		this.ciclosLavado = ciclosLavado;
		this.tipo = tipo;
	}

	public String toString () {
		return "Lavadora: Libras: " + libras + "   Ciclo de Lavado:" + ciclosLavado + "  Tipo:"+ tipo;
	}

}

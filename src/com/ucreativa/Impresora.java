package com.ucreativa;
public class Impresora {

	private String marca;
	private String tipoTinta;
	private float precio;
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipoTinta() {
		return tipoTinta;
	}


	public void setTipoTinta(String tipoTinta) {
		this.tipoTinta = tipoTinta;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	/**
	 * 
	 */
	public Impresora() {
		// TODO Auto-generated constructor stub
	}


	public Impresora(String marca, String tipoTinta, float precio) {
		super();
		this.marca = marca;
		this.tipoTinta = tipoTinta;
		this.precio = precio;
	}
	
	public String toString () {
		return "Impresora: Marca: " + marca + "   Tipo de tinta:" + tipoTinta + "  Precio:"+ precio;
	}

	
}
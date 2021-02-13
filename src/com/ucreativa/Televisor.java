/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Televisor {

	private String esSmart;
	private String tipoControl;
	private String marca;
	
	public String getEsSmart() {
		return esSmart;
	}

	public void setEsSmart(String esSmart) {
		this.esSmart = esSmart;
	}

	public String getTipoControl() {
		return tipoControl;
	}

	public void setTipoControl(String tipoControl) {
		this.tipoControl = tipoControl;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * 
	 */
	public Televisor() {
		// TODO Auto-generated constructor stub
	}

	public Televisor(String esSmart, String tipoControl, String marca) {
		super();
		this.esSmart = esSmart;
		this.tipoControl = tipoControl;
		this.marca = marca;
	}
	

	public String toString () {
		return "Televisor: Es Smart: " + esSmart + "   Tipo de control:" + tipoControl + "  Marca:"+ marca;
	}


}

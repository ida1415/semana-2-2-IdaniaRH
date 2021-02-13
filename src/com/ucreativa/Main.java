/**
 * 
 */
package com.ucreativa;

/**
 * @author Idania
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro perro1 = new Perro ("ZEUS", "Negro", 100);
		Impresora impresora1 =  new Impresora ("Epson", "EcoTank", 10000);
		Lavadora lavadora1 = new Lavadora (20, "Fuerte", "Automatica");
		Televisor televisor1 = new Televisor ("Si", "Blutooth", "Xiaomi");
		
		System.out.println("Instanacia 1");
		System.out.println(perro1.toString());

		System.out.println("Instanacia 2");
		System.out.println(impresora1.toString());
		
		System.out.println("Instanacia 3");
		System.out.println(lavadora1.toString());
		
		System.out.println("Instanacia 4");
		System.out.println(televisor1.toString());
	}
	

}

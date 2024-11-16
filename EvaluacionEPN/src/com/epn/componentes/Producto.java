package com.epn.componentes;

public class Producto {

	// Attributes
	private String name;
	private double price;
	private String code;

	// Methods
	public void incrementarPrecio(int porcentaje) {
		double calculo;
		/*
		 * La variable calculo lo que hace es pasar piorcentaje que le llega como entero
		 * a un valor con el cual puede trabajar el programa
		 */
		double incremento;
		double precioConIncremento;

		// Se pasa el entero a un valor float

		calculo = porcentaje/100.0;

		// Se calcula el incremento respecto al precio del producto actualmente;

		incremento = this.price * calculo;

		// Se obtiene el nuevo precio con el incremento;

		precioConIncremento = this.price + incremento;
		this.price=precioConIncremento;

	}
	
	public void disminuirPrecio(double descuento) {

		/*
		 * La variable calculo lo que hace es pasar piorcentaje que le llega como entero
		 * a un valor con el cual puede trabajar el programa
		 */
		double descuento1;
		double precioConDescuento;

		// Se calcula el descuento respecto al precio del producto actualmente;

		descuento1 = price * descuento;

		// Se obtiene el nuevo precio con el descuento;

		precioConDescuento = price - descuento;
		this.price=precioConDescuento;
		
	}
	
	
	//Constructors

	public Producto(String code, String name, double price) {

		this.name = name;
		this.price = price;
		this.code = code;
	}


	
	//Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	
	

}

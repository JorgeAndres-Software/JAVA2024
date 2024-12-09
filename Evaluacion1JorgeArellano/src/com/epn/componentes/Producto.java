package com.epn.componentes;

public class Producto {

	// Attributes
	private String nombre;
	private double precio;
	private String codigo;

	// Constructor

	public Producto(String codigo, String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	// Methods

	public void incrementarPrecio(int porcentajedeIncremento) {

		double calculoDePorcentaje = porcentajedeIncremento / 100.0;

		double incremento = this.precio * calculoDePorcentaje;

		this.precio = precio + incremento;

	}

	public void disminuirPrecio(double descuento) {

		/*
		 * La variable calculo lo que hace es pasar piorcentaje que le llega como entero
		 * a un valor con el cual puede trabajar el programa
		 */
		double descuento1;
		double precioConDescuento;

		// Se calcula el descuento respecto al precio del producto actualmente;

		descuento1 = precio * descuento;

		// Se obtiene el nuevo precio con el descuento;

		precioConDescuento = precio - descuento;
		this.precio=precioConDescuento;
		
	}

}

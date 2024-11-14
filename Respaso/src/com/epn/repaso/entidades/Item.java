package com.epn.repaso.entidades;

public class Item {
	//Se crean los atributos
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	//Getters y Setters
	
	
	//Metodo Imprimir
	
	public void imprimir () {
		System.out.println("Nombre: "+nombre);
		System.out.println("Productos Actuales: "+productosActuales);
		System.out.println("Productos Devueltos: "+productosDevueltos);
		System.out.println("Productos Vendidos: "+productosVendidos);
	}
	
	//Metodo Vender
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void Vender (int productosVendidos) {
		this.productosActuales -= productosVendidos;
		this.productosVendidos += productosVendidos;
	}
	
	//Metodo Devolver
	public void Devolver (int productosVendidos) {
		this.productosActuales+=productosVendidos;
		this.productosVendidos-= productosVendidos;
		this.productosDevueltos+= productosVendidos;
		
	}
}

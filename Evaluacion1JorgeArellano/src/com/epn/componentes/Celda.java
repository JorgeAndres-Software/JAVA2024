package com.epn.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	
	
	//Constructor
	
	public Celda(String codigo) {
		this.codigo = codigo;
	}
	
	//Getters and setters

	public Producto getProducto() {
		return producto;
	}



	public void setProducto(Producto producto) {
		this.producto = producto;
	}



	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	//Methods
	public void ingresarProducto(Producto producto, int stockInicial) {
		this.producto=producto;
		this.stock=stockInicial;
	}
}

package com.epn;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stockActual;
	
	//Default 
	public Producto() {
		//Programado de manera automatica por JAVA
	}
	
	public Producto(String nombre, String descripcion, double precio, int stockActual) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.precio=precio;
		this.stockActual=stockActual;
		
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getStockActual() {
		return stockActual;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	public void setStockActual(int stockActual) {
		this.stockActual=stockActual;
	}
	
}

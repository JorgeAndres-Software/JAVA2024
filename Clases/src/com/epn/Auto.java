package com.epn;

public class Auto {
	private String marca;
	private int anio;
	private double precio;
	
	//Constructor
	
	//Default
	
	public Auto() {
		
	}
	
	public Auto (String marca, int anio, double precio) {
		this.marca= marca;
		this.anio= anio;
		this.precio= precio;
	}

	// Getters
	public String getMarca() {
		return marca;
	}

	public int getAnio() {
		return anio;
	}

	public double getPrecio() {
		return precio;
	}

	// Setters

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}

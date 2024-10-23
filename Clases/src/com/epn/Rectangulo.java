package com.epn;

public class Rectangulo {
	private int base;
	private int altura;
	
	//Constructor Default
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;
		
	}
	
	// Getters and Setters
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea() {
		int area=base*altura;
		return area;
	}
	
	// Methods Rectangle Class
	
	public int calcularPerimetro() {
		int perimetro=base+base+altura+altura;
		return perimetro;
	}
}

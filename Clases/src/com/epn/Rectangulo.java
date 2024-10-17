package com.epn;

public class Rectangulo {
	public int base;
	public int altura;
	
	public int calcularArea() {
		int area=base*altura;
		return area;
	}
	
	public int calcularPerimetro() {
		int perimetro=base+base+altura+altura;
		return perimetro;
	}
}

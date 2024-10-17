package com.epn;

public class Cuadrado {
	public double lado;

	public double area() {
		double area;
		area = lado * lado;
		return area;

	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro=lado*4;
		return perimetro;
	}
}

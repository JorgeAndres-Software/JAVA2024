package com.epn;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		int area1;
		int area2;
		
		int perimetro1;
		int perimetro2;
		
		r1.base=10;
		r1.altura=5;
		area1=r1.calcularArea();
		perimetro1=r1.calcularPerimetro();
		
		r2.base=8;
		r2.altura=3;
		area2=r2.calcularArea();
		perimetro2=r2.calcularPerimetro();
		
		System.out.println("Area Rectangulo 1:  "+area1);
		System.out.println("Area Rectangulo 2:  "+area2);
		
		System.out.println("Perimetro Rectangulo 1: "+perimetro1);
		System.out.println("Perimetro Rectangulo 2: "+perimetro2);

	}
	
	

}

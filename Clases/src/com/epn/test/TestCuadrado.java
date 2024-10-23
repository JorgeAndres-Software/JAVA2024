package com.epn.test;

import com.epn.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();

		// Variables en las que se va a guardar el retorno de los metodos;

		// AREA

		double area1;
		double area2;
		double area3;

		// PERIMETRO
		double perimetro1;
		double perimetro2;
		double perimetro3;

		// Asigno valores a los atributos de ccada objeto;

		c1.lado = 5;
		c2.lado = 6.45;
		c3.lado = 8.4;

		// LLamo a los metodos de los objetos;

		// Cuadrado 1
		area1 = c1.area();
		perimetro1 = c1.calcularPerimetro();

		// Cuadrado 2
		area2 = c2.area();
		perimetro2 = c2.calcularPerimetro();

		// Cuadrado 3
		area3 = c3.area();
		perimetro3 = c3.calcularPerimetro();

		// Aplico los comentarios para que se muestre en pantalla

		System.out.println("Area Cuadrado 1: " + area1);
		System.out.println("Perimetro Cuadrado 1: " + perimetro1);
		System.out.println("----------------------------------");

		System.out.println("Area Cuadrado 2: " + area2);
		System.out.println("Perimetro Cuadrado 2: " + perimetro2);
		System.out.println("----------------------------------");

		System.out.println("Area Cuadrado 3: " + area3);
		System.out.println("Perimetro Cuadrado 3: " + perimetro3);
		System.out.println("----------------------------------");

	}

}

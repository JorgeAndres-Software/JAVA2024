package com.epn;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();

		auto1.marca = "CHEVROLET";
		auto1.anio = 2016;
		auto1.precio = 16.999;

		auto2.marca = "KIA";
		auto2.anio = 2024;
		auto2.precio = 20.999;

		// Auto 1
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);
		
		System.out.println("----------------------");

		// Auto 2

		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);

	}

}
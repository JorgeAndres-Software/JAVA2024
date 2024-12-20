package com.epn.test;

import com.epn.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto("Mclaren", 2016, 159.999);

		auto1.setMarca("CHEVROLET");
		auto1.setAnio(2016);
		auto1.setPrecio(16.999);

		auto2.setMarca("KIA");
		auto2.setAnio(2024);
		auto2.setPrecio(20.999);

		// Auto 1
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());

		System.out.println("----------------------");

		// Auto 2

		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
		
		System.out.println("----------------------");

		// Auto 3
		System.out.println("Marca: " + auto3.getMarca());
		System.out.println("Año: " + auto3.getAnio());
		System.out.println("Precio: " + auto3.getPrecio());

	}

}

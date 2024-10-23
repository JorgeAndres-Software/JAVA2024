package com.epn.test;

import com.epn.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto p1 = new Producto(25698,"SAMSUNG GALAXY A30");
		p1.setDescripcion("Lo ultimo en tecnologia para este 2024.");
		p1.setPeso(144);
		
		System.out.println("-------------------------");
		System.out.println("********SU COMPRA********");
		System.out.println("ID: "+p1.getCodigo());
		System.out.println("Producto: "+p1.getNombre());
		System.out.println("Descripcion: "+p1.getDescripcion());
		System.out.println("Peso: "+p1.getPeso()+" g");
		
	}

}

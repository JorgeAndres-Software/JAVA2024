package com.epn.test;

import com.epn.componentes.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto=new Producto("KE34","Papitas",0.85);
		System.out.println("Codigo:"+producto.getCode());
		System.out.println("Nombre:"+producto.getName());
		System.out.println("Precio:"+producto.getPrice());
		System.out.println("*************************************");
		producto.setPrice(0.90);
		System.out.println("Nuevo Precio:"+producto.getPrice());
		
		producto.incrementarPrecio(50);
		System.out.println("Precio incrementado:"+producto.getPrice());
		
		producto.disminuirPrecio(0.35);;
		System.out.println("Precio con descuento:"+producto.getPrice());
		
		
	}
}

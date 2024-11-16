package com.epn.test;

import com.epn.componentes.Celda;
import com.epn.componentes.Producto;

public class TestContenidoCelda {

	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		Producto producto=new Producto("KE34","Papitas",0.85);
		celda.ingresarProducto(producto, 5);
		
		System.out.println("CELDA:"+celda.getCodigo());
		System.out.println("*************************************");
		System.out.println("Nombre Producto:"+celda.getProducto().getName());
		System.out.println("Precio Producto:"+celda.getProducto().getPrice());
		System.out.println("Codigo Producto:"+celda.getProducto().getCode());
		System.out.println("STOCK:"+celda.getStock());
	}

}

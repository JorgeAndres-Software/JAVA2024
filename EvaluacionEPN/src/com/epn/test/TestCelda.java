package com.epn.test;

import com.epn.componentes.Celda;
import com.epn.componentes.Producto;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		Producto p1 = new Producto("KE34","Papitas",0.85);
		celda.ingresarProducto(p1, 5);
		
		System.out.println("CELDA:"+celda.getCodigo());
		System.out.println("*************************************");
		System.out.println("Nombre Producto:"+celda.getProducto().getName());
		System.out.println("Precio Producto:"+celda.getProducto().getPrice());
		System.out.println("Codigo Producto:"+celda.getProducto().getCode());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}

//La clase en la que nos da el nullPointerException es Celda, especificamente en la linea 8,
// null.algo(); en la variable Producto

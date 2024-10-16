package com.epn;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		productoA.nombre="Paracetamol";
		productoA.descripcion="Antibiotico diseñado para sistomas gripales";
		productoA.precio=0.90;
		productoA.stockActual=10;
		
		productoB.nombre="ENSURE ADVANCE";
		productoB.descripcion="Nutrientes como suplemento alimenticio para adultos.";
		productoB.precio=16.99;
		productoB.stockActual=10;
		
		productoC.nombre="PEDIASURE";
		productoC.descripcion="Nutrientes como suplemento alimenticio para niños.";
		productoC.precio=20.99;
		productoC.stockActual=10;
		
		//Producto A
		
		System.out.println("Nombre: "+productoA.nombre);
		System.out.println("Desccripcion: "+productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock Actual: "+productoA.stockActual);
		
		System.out.println("--------------------------------------");
		
		//Producto B
		System.out.println("Nombre: "+productoB.nombre);
		System.out.println("Desccripcion: "+productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock Actual: "+productoB.stockActual);
		
		System.out.println("--------------------------------------");
		
		//Producto C
		
		System.out.println("Nombre: "+productoC.nombre);
		System.out.println("Desccripcion: "+productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock Actual: "+productoC.stockActual);
		
		System.out.println("--------------------------------------");
		
		
		

	}

}

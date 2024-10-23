package com.epn;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		Producto productoD = new Producto("IBUPROFENO","EFICIENTE EN LA TRATA DE INFECCIONES GRIPALES",1.25,20);
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Antibiotico diseñado para sistomas gripales");;
		productoA.setPrecio(0.99);
		productoA.setStockActual(10);;
		
		productoB.setNombre("ENSURE ADVANCE");
		productoB.setDescripcion("Nutrientes como suplemento alimenticio para adultos.");
		productoB.setPrecio(16.99);;
		productoB.setStockActual(10);;
		
		productoC.setNombre("PEDIASURE");
		productoC.setDescripcion("Nutrientes como suplemento alimenticio para niños.");
		productoC.setPrecio(20.99);;
		productoC.setStockActual(10);;
		
		//Producto A
		
		System.out.println("Nombre: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock Actual: "+productoA.getStockActual());
		
		System.out.println("--------------------------------------");
		
		//Producto B
		System.out.println("Nombre: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock Actual: "+productoB.getStockActual());
		
		System.out.println("--------------------------------------");
		
		//Producto C
		
		System.out.println("Nombre: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock Actual: "+productoC.getStockActual());
		
		System.out.println("--------------------------------------");
		
		//Producto D
		System.out.println("Nombre: "+productoD.getNombre());
		System.out.println("Descripciun: "+productoD.getDescripcion());
		System.out.println("Precio: "+productoD.getPrecio());
		System.out.println("Stock Actual: "+productoD.getStockActual());
		
		System.out.println("-------------------------------------------");
		
		
		

	}

}

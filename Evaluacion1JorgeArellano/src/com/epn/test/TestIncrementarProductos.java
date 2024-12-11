package com.epn.test;

import com.epn.componentes.Celda;
import com.epn.componentes.Producto;
import com.epn.maquina.MaquinaDulces;

public class TestIncrementarProductos {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B", 4);
		Producto producto2 = new Producto("PRTO", "Gatorade", 2.54);
		maquina.cargarProducto(producto2, "D", 5);
		
		maquina.mostrarProductos();
		
		maquina.incrementarProductos("KE34", 6);
		
		System.out.println("------------LUEGO DEL INCREMENTO-------------");
		
		maquina.mostrarProductos();
		
	}
}
package com.epn.test;

import com.epn.componentes.Producto;
import com.epn.maquina.MaquinaDulces;

public class TestBuscarProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto productoEncontrado=maquina.buscarProductoEnCelda("B1");
		System.out.println("Producto encontrado:"+productoEncontrado.getName());
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod);
		
		
		
		
	}
}

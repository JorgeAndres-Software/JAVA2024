package com.epn.test;

import com.epn.componentes.Celda;
import com.epn.componentes.Producto;
import com.epn.maquina.MaquinaDulces;

public class TestBuscarCeldaProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda("A1");
		maquina.agregarCelda("A2");
		maquina.agregarCelda("B1");
		maquina.agregarCelda("B2");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		Celda celda = maquina.buscarCeldaProducto("KE34");
		System.out.println("Celda que contiene el producto: " + celda.getCodigo());

	}
}

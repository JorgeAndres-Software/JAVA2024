package com.epn.test;

import com.epn.componentes.Producto;
import com.epn.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getName());
		
		//La linea exacta en la que se priodujo el NullPoinerExcption fue la 15 debiodo a que prod esta en null ya que no esta definido.
		
		
		
	}
}

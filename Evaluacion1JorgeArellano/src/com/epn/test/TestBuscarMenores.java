package com.epn.test;

import java.util.ArrayList;

import com.epn.componentes.Producto;
import com.epn.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		System.out.println("Productos Menores");
		System.out.println("------------------");
		MaquinaDulces maquina= new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		maquina.agregarCelda("E");
		maquina.agregarCelda("F");
		Producto producto1=new Producto("FGH0","CHICLE",0.25);
		maquina.cargarProducto(producto1, "A", 10);
		
		Producto producto2=new Producto("FUY0","PAPITAS",0.50);
		maquina.cargarProducto(producto2, "B", 15);
		
		Producto producto3=new Producto("LQER","DORITOS",0.55);
		maquina.cargarProducto(producto3, "C", 12);
		
		Producto producto4=new Producto("UYIO","CHIFLES",0.75);
		maquina.cargarProducto(producto4, "D", 15);
		
		Producto producto5=new Producto("DERT","LECHE",1.00);
		maquina.cargarProducto(producto5, "E", 10);
		
		Producto producto6=new Producto("IZAS","COCA-COLA",1.50);
		maquina.cargarProducto(producto6, "F", 8);
		
		ArrayList<Producto> bM=maquina.buscarMenores(2.00);
		
		System.out.println("---------------------------");
		System.out.println("Total: "+bM.size());
	
		
	}

}

package com.epn.repaso.test;

import com.epn.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se instancia al objeto
		Item i1 = new Item();
		//Accedemos a I1
		i1.setNombre("Jorge");
		i1.setProductosActuales(100);
		i1.imprimir();
		
		//Metodo Vender
		i1.Vender(20);
		i1.imprimir();
		
		//Metodo Devolver
		i1.Devolver(10);
		i1.imprimir();

	}

}

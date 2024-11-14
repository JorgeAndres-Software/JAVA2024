package com.epn.repaso.test;

import com.epn.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p1= new Producto ("SAMSUNG GALAXY A50", 250.99);
		
		//Accedemos a p1
		
		p1.setPrecio(350.99);
		p1.calcularPrecioPromo(0.3);

	}

}

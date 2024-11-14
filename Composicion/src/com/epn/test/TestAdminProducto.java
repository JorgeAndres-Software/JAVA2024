package com.epn.test;

import com.epn.composicion.AdminProducto;
import com.epn.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminProducto admin = new AdminProducto();

		Producto mc;

		Producto producto1 = new Producto("Doritos", 0.50);
		Producto producto2 = new Producto("Papitas", 0.5);

		mc = admin.bscarMasCaro(producto1, producto2);

		if (mc == null) {
			System.out.println("Son iguales");
		} else {

			System.out.println("El producto mas caro es : " + mc.getNombre());
		}
	}

}

package com.epn.composicion;

public class AdminProducto {
	//Recbe 2 productos
	//Retorna el de mayor precio;
	//Si tienen el mismo precio retornan null
	
	public Producto bscarMasCaro(Producto p1, Producto p2) {
		if(p1.getPrecio()>p2.getPrecio()) {
			return p1;
		}else if  (p2.getPrecio()>p1.getPrecio()){
			return p2;
		}else {
			return null;
		}
	}
}

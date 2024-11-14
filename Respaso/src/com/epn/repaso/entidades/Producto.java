package com.epn.repaso.entidades;

public class Producto {
	//Creamos los atributos
	private String nombre;
	private double precio;
	
	// Constructor
	public Producto (String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}


	public void setPrecio(double precio) {
	
		if(precio<0) {
			this.precio=precio*-1;
			System.out.println("El precio es: "+this.precio);
		}else if (precio >=0) {
			this.precio=precio;
		}
	}

	
	//Metodo calcular Propmocion
	
	public double calcularPrecioPromo(double descuento) {
		double descuentoValor = precio-(precio*descuento);
		System.out.println("El valor del producto con el desceunto es: "+descuentoValor);
		return descuentoValor;
	}
	
	
	
	
}

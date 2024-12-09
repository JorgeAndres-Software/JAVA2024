package com.epn.maquina;

import java.util.ArrayList;

import com.epn.componentes.Celda;
import com.epn.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	// Methods
	public void agregarCelda(String codigo) {
		Celda c1 = new Celda(codigo);
		celdas.add(c1);
	}

	public void mostrarConfiguracion() {
		Celda celda;
		for (int i = 0; i < celdas.size(); i++) {
			celda = celdas.get(i);
			System.out.println("Celda " + (i + 1) + ":" + celda.getCodigo());
		}
		System.out.println("---------------------------------------------");
		System.out.println("La maquina contiene: " + celdas.size() + " celdas.");
	}

	public Celda buscarCelda(String codigo) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getCodigo().equals(codigo)) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.ingresarProducto(producto, stock);
	}

	public void mostrarProductos() {
		Celda celda = null;
		for (int i = 0; i < celdas.size(); i++) {
			celda = celdas.get(i);
			if (celda.getProducto() != null) {
				System.out.println("Celda:" + celda.getCodigo());
				System.out.println("Codigo: " + celda.getProducto().getCodigo());
				System.out.println("Stock: " + celda.getStock());
				System.out.println("Nombre: " + celda.getProducto().getNombre());
				System.out.println("Precio: " + celda.getProducto().getPrecio());
				System.out.println("-------------------------------------------");

			} else {
				System.out.println("Celda:" + celda.getCodigo());
				System.out.println("Stock: " + celda.getStock());
				System.out.println("Sin producto asignado");
				System.out.println("---------------------------");
			}
		}

		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda elementoEncontrado = null;
		Producto productoEncontrado = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoEncontrado = celdas.get(i);
			if (elementoEncontrado.getCodigo().equals(codigo)) {
				productoEncontrado = elementoEncontrado.getProducto();
			}
		}
		return productoEncontrado;

	}

	public double consultarPrecio(String codigo) {
		Celda elemento = null;
		double precioEncontrado = 0.0;
		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);
			if (elemento.getCodigo().equals(codigo)) {
				precioEncontrado = elemento.getProducto().getPrecio();
			}
		}

		return precioEncontrado;
	}

	public Celda buscarCeldaProducto(String codigo) {
		Celda elemento = null;

		Celda celdaEncontrada = null;

		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);
			if (elemento.getProducto() != null) {
				if (elemento.getProducto().getCodigo().equals(codigo)) {
					celdaEncontrada = elemento;
				}
			}
		}
		return celdaEncontrada;
	}

	public void incrementarProductos(String codigoProducto, int stock) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		int stockActual = celdaEncontrada.getStock();
		int stockIncrementado = stockActual + stock;
		celdaEncontrada.setStock(stockIncrementado);
	}

	public void vender(String codigo) {
		Celda elemento;
		for (int i = 0; i < celdas.size(); i++) {
			elemento = celdas.get(i);
			if (elemento.getCodigo().equals(codigo)) {
				int stock = elemento.getStock();
				double precio = elemento.getProducto().getPrecio();
				int stockModificado = stock - 1;
				elemento.setStock(stockModificado);
				this.saldo = saldo + precio;

			}
		}
	}

	public double VenderConCambio(String codigo, double valorIngresado) {
		Celda elemento = buscarCelda(codigo);
		int stockActual = elemento.getStock();
		int stockModificado = stockActual - 1;
		elemento.setStock(stockModificado);
		double precio = elemento.getProducto().getPrecio();
		this.saldo = saldo + precio;

		if (precio >= valorIngresado) {
			precio = 0.0;
		} else {
			precio = valorIngresado - precio;
		}

		return precio;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Producto producto = null;
		Celda elementosMenores;
		for (int i = 0; i < celdas.size(); i++) {
			elementosMenores = celdas.get(i);
			if (elementosMenores.getProducto().getPrecio() <= limite) {
				producto = elementosMenores.getProducto();
				menores.add(producto);
				System.out.println("Nombre:" + producto.getNombre() + " " + "Precio: " + producto.getPrecio());
			}
		}
		

		return menores;
	}

}

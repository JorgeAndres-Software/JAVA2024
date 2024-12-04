package com.epn.maquina;

import com.epn.componentes.Celda;
import com.epn.componentes.Producto;

public class MaquinaDulces {
	// Attributes
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	// Methods
	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1 = new Celda(c1);
		celda2 = new Celda(c2);
		celda3 = new Celda(c3);
		celda4 = new Celda(c4);
	}
	
	//Se instancia la celdas ya que sin celdas no bay una maquina de dulces como tal

	public void mostrarConfiguracion() {
		
		System.out.println("CELDA1: " + celda1.getCodigo());
		System.out.println("CELDA2: " + celda2.getCodigo());
		System.out.println("CELDA3: " + celda3.getCodigo());
		System.out.println("CELDA4: " + celda4.getCodigo());
	

	}

	public Celda buscarCelda(String code) {
		if (code == celda1.getCodigo()) {
			return celda1;
		} else if (code == celda2.getCodigo()) {
			return celda2;
		} else if (code == celda3.getCodigo()) {
			return celda3;
		} else if (code == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String code, int cantidad) {
		Celda celdaRecuperada = buscarCelda(code);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	
	public void mostrarProductos() {
		System.out.println("--------CELDA 1---------");
		System.out.println("Codigo: "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		if(celda1.getStock()==0) {
			System.out.println("La celda no tiene producto!!!");
		}else {
			System.out.println("Nombre: "+celda1.getProducto().getName());
			System.out.println("Precio: "+celda1.getProducto().getPrice());
			System.out.println("Codigo: "+celda1.getProducto().getCode());
		}
		System.out.println("------------------------");
		
		System.out.println("--------CELDA 2---------");
		System.out.println("Codigo: "+celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		if(celda2.getStock()==0) {
			System.out.println("La celda no tiene producto!!!");
		}else {
			System.out.println("Nombre: "+celda2.getProducto().getName());
			System.out.println("Precio: "+celda2.getProducto().getPrice());
			System.out.println("Codigo: "+celda2.getProducto().getCode());
		}
		System.out.println("------------------------");
		
		System.out.println("--------CELDA 3---------");
		System.out.println("Codigo: "+celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		if(celda3.getStock()==0) {
			System.out.println("La celda no tiene producto!!!");
		}else {
			System.out.println("Nombre: "+celda3.getProducto().getName());
			System.out.println("Precio: "+celda3.getProducto().getPrice());
			System.out.println("Codigo: "+celda3.getProducto().getCode());
		}
		System.out.println("------------------------");
		
		System.out.println("--------CELDA 4---------");
		System.out.println("Codigo: "+celda4.getCodigo());
		System.out.println("Stock: "+celda4.getStock());
		if(celda4.getStock()==0) {
			System.out.println("La celda no tiene producto!!!");
		}else {
			System.out.println("Nombre: "+celda4.getProducto().getName());
			System.out.println("Precio: "+celda4.getProducto().getPrice());
			System.out.println("Codigo: "+celda4.getProducto().getCode());
		}
		System.out.println("------------------------");
		
		System.out.println("Saldo: "+saldo);
	}

	public Producto buscarProductoEnCelda(String code) {
		if (code == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (code == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (code == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (code == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String code) {
		if (code == celda1.getCodigo()) {
			return celda1.getProducto().getPrice();
		} else if (code == celda2.getCodigo()) {
			return celda2.getProducto().getPrice();
		} else if (code == celda3.getCodigo()) {
			return celda3.getProducto().getPrice();
		} else if (code == celda4.getCodigo()) {
			return celda4.getProducto().getPrice();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String code) {
		if (code == null) {
			return null;
		}
		if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCode() == code) {
			return celda1;
		} else if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCode() == code) {
			return celda2;
		} else if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCode() == code) {
			return celda3;
		} else if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCode() == code) {
			return celda4;
		}
		return null;
	}

	public void incrementarProductos(String code, int cantidad) {
		int stockActual;
		int stockIncrementado;
		Celda celdaEncontrada = buscarCeldaProducto(code);
		stockActual = celdaEncontrada.getStock();

		stockIncrementado = stockActual + cantidad;
		celdaEncontrada.setStock(stockIncrementado);

	}

	public void vender(String code) {
		if (code == celda1.getCodigo()) {
			int stockActual;
			double precioMaquina;
			int stockDV;
			stockActual = celda1.getStock();
			stockDV = stockActual - 1;
			celda1.setStock(stockDV);
			precioMaquina = celda1.getProducto().getPrice();
			this.saldo = saldo + precioMaquina;

		}else if(code == celda2.getCodigo()) {
			int stockActual;
			double precioMaquina;
			int stockDV;
			stockActual = celda2.getStock();
			stockDV = stockActual - 1;
			celda2.setStock(stockDV);
			precioMaquina = celda2.getProducto().getPrice();
			this.saldo = saldo + precioMaquina;

		}else if (code == celda3.getCodigo()) {
			int stockActual;
			double precioMaquina;
			int stockDV;
			stockActual = celda3.getStock();
			stockDV = stockActual - 1;
			celda3.setStock(stockDV);
			precioMaquina = celda3.getProducto().getPrice();
			this.saldo = saldo + precioMaquina;

		}else if(code==celda4.getCodigo()) {
			int stockActual;
			double precioMaquina;
			int stockDV;
			stockActual = celda4.getStock();
			stockDV = stockActual - 1;
			celda4.setStock(stockDV);
			precioMaquina = celda4.getProducto().getPrice();
			this.saldo = saldo + precioMaquina;
		}
		
		
	}
	
	public double venderConCambio(String code, double valorIngresado) {
		if(code==celda1.getCodigo()) {
			int stockActual;
			int stockNuevo;
			stockActual=celda1.getStock();
			stockNuevo=stockActual-1;
			this.saldo=saldo+valorIngresado;
			
			return valorIngresado-celda1.getProducto().getPrice();
			
		}else if(code==celda2.getCodigo()) {
			int stockActual;
			int stockNuevo;
			stockActual=celda2.getStock();
			stockNuevo=stockActual-1;
			this.saldo=saldo+valorIngresado;
			
			return valorIngresado-celda2.getProducto().getPrice();
			
		}else if(code==celda3.getCodigo()) {
			int stockActual;
			int stockNuevo;
			stockActual=celda3.getStock();
			stockNuevo=stockActual-1;
			this.saldo=saldo+valorIngresado;
			
			return valorIngresado-celda3.getProducto().getPrice();
		}else if(code==celda4.getCodigo()) {
			int stockActual;
			int stockNuevo;
			stockActual=celda4.getStock();
			stockNuevo=stockActual-1;
			this.saldo=saldo+valorIngresado;
			
			return valorIngresado-celda4.getProducto().getPrice();
		}else {
			return 0.0;
		}
	}
}

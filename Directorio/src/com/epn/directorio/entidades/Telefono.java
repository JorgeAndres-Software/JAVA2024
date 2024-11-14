package com.epn.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsApp;
	
	//Constructor
	
	public Telefono(String operadora, String numero, int codigo) {

		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
		this.tieneWhatsApp=false;
	}
	
	//Metodo Imprimir
	
	public void imprimir () {
		System.out.println("Operadora: "+operadora);
		System.out.println("Numero: "+numero);
		System.out.println("Codigo: "+codigo);
	}
	

	
}

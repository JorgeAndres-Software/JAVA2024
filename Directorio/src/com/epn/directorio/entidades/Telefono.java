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
	
	
	//Getters y Setters
	
	public String getOperadora() {
		return operadora;
	}



	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public boolean isTieneWhatsApp() {
		return tieneWhatsApp;
	}



	public void setTieneWhatsApp(boolean tieneWhatsApp) {
		this.tieneWhatsApp = tieneWhatsApp;
	}

	
	//Metodo Imprimir
	
	

	public void imprimir () {
		System.out.println("-------------------------------------");
		System.out.println("Operadora: "+operadora);
		System.out.println("Numero: "+numero);
		System.out.println("Codigo: "+codigo);
		System.out.println("Tiene WhatsApp: "+tieneWhatsApp);
		System.out.println("-------------------------------------");
	}
	

	
}

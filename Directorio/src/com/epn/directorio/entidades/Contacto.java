package com.epn.directorio.entidades;

public class Contacto {
	private String nombre;
	private String apellido;
	private boolean activo;
	private Telefono telefono;
	private double peso;
	
	
	//Constructor
	
	public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	
	
	//Getters and Setters
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellido() {
		return apellido;
	}




	public void setApellido(String apellido) {
		this.apellido = apellido;
	}




	public boolean isActivo() {
		return activo;
	}




	public void setActivo(boolean activo) {
		this.activo = activo;
	}




	public Telefono getTelefono() {
		return telefono;
	}




	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}




	public double getPeso() {
		return peso;
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}


	
	
	
	//Imprimir
	


	public void imprimir() {
		System.out.println("-------------------------------------");
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Operadora: "+telefono.getOperadora());
		System.out.println("Numero: "+telefono.getNumero());
		System.out.println("Peso: "+peso);
		System.out.println("Activo: "+activo);
		System.out.println("-------------------------------------");
	}
	
	
}

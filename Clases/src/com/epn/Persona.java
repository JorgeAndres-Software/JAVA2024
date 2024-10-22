package com.epn;

public class Persona {
	private String nombre;
	private int edadPersona;
	private double estatura;
	
	//Metodo Proporciopnado por JAVA
	
	public Persona() {
		System.out.println("Ingresa al constructor");
	}
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	public Persona(String nombre, int edad, double estatura) {
		this.nombre=nombre;
		this.edadPersona=edad;
		this.estatura=estatura;
		
	}
	

	// Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdadPersona() {
		return edadPersona;
	}

	public double getEstatura() {
		return estatura;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

}

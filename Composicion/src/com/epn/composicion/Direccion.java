package com.epn.composicion;

public class Direccion {
	private String callePrincipal;
	private String calleSecundaria;
	private String number;
	private double latitud;
	private double longitud;
	
	
	//Constructor
	public Direccion(String callePrincipal, String calleSecundaria, String number) {
	
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
		this.number = number;
	}
	
	public Direccion () {
		
	}
	
	//Getters y Setters
	public String getCallePrincipal() {
		return callePrincipal;
	}
	
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	
}

package com.epn.herencia;

public class Cuenta {
	private String numeroCuenta;
	private double saldo;
	
	
	//Constructor
	public Cuenta(String numeroCuenta, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	//Getters and Setters
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	// Method .toString
	
	@Override
	public String toString() {
		return "Numero Cuenta: "+numeroCuenta+" Saldo: "+saldo;
	}
	
	
}

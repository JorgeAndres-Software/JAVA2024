package com.epn;

public class Calculadora {
	public int sumar(int a, int b) {
		int resultado;
		resultado=a+b;
		return resultado;
	}
	
	public int restar(int a, int b) {
		int resultado;
		resultado=a-b;
		return resultado;
	}
	
	public double multiplicar(double valor1,double valor2) {
		double producto;
		producto=valor1*valor2;
		return producto;
	}
	
	public double dividir(double dividendo, double divisor) {
		double cociente;
		cociente=dividendo/divisor;
		return cociente;
	}
	
	public double promediar (double valor1, double valor2, double valor3) {
		double promedio;
		promedio= (valor1+valor2+valor3)/3;
		return promedio;
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, regreso en 15 minutos");
	}
}
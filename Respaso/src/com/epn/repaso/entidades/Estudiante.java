package com.epn.repaso.entidades;

public class Estudiante {
	//Se crean los atributos
	private String nombre;
	private double nota;
	private String resultado;
	
	//Constructor 
	
	public Estudiante (String nombre) {
		this.nombre= nombre;
	}
	
	//Metodo Calificar
	public void calificar (double nota) {
		this.nota= nota;
		//Condicion
		if(nota<8) {
			this.resultado="F";
			System.out.println(resultado);
		}else if(nota>=8) {
			this.resultado="A";
			System.out.println(resultado);
		}
	}
	
}

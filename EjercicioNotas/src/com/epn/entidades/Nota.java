package com.epn.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;

	// Constructor
	public Nota(Materia materia, double calificacion) {

		this.materia = materia;
		this.calificacion = calificacion;
	}
	
	// Getters and Setters

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	// Methods
	public void mostrar() {
		System.out.println("Materia: " + materia + ", Calificacion:" + calificacion);
	}

}

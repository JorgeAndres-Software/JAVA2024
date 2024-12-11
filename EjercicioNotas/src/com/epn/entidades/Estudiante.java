package com.epn.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	// Getters and Setters
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	// Constructor
	public Estudiante(String cedula, String nombre, String apellido) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas = new ArrayList<Nota>();

	}

	// Methods

	public void agregarNota(Nota nota) {
		Nota elementoNota;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if ((elementoNota.getMateria().getCodigo() != nota.getMateria().getCodigo())
					&& (elementoNota.getCalificacion() > 0 && elementoNota.getCalificacion() < 11)) {
				notas.add(elementoNota);
				System.out.println("Nota agregada con exito!");
			}
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota elementoNota;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if (elementoNota.getMateria().getCodigo().equals(codigo)) {
				if (elementoNota.getCalificacion() > 0 && elementoNota.getCalificacion() < 11) {
					elementoNota.setCalificacion(nuevaNota);
				}
			} else {
				System.out.println("No se encontro el codigo");
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		Nota elementoNota;
		double sumaNotas = 0.0;
		double promedio;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			sumaNotas = sumaNotas + elementoNota.getCalificacion();
		}

		promedio = sumaNotas / notas.size();
		return promedio;
	}

	public void mostrar() {
		System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", Cedula: " + cedula);
		Nota elementoNota;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			System.out.println("Materia: " + elementoNota.getMateria().getNombre() + ", Codigo: "
					+ elementoNota.getMateria().getCodigo() + ", Nota: " + elementoNota.getCalificacion());
		}

	}
}

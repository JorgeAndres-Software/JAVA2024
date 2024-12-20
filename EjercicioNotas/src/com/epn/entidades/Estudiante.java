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
		this.notas = new ArrayList<Nota>();

	}

	// Methods

	public void agregarNota(Nota nuevaNota) {
		Nota elementoNota = null;
		if (nuevaNota.getCalificacion() >= 0.0 && nuevaNota.getCalificacion() <= 10.0) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				if (elementoNota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
					System.out.println("La nota ya existe!! " + nuevaNota.getMateria().getCodigo());
				}
			}
			notas.add(nuevaNota);
			System.out.println("Nota agregada con exito en el sistema Saew!!");
		} else {
			System.out.println("La nota debe estar en un rango entre 0-10");
		}
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota elementoNota = null;

		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if (elementoNota.getMateria().getCodigo().equals(codigo)) {
				if (nuevaNota >= 0.0 && nuevaNota <= 10.0) {
					elementoNota.setCalificacion(nuevaNota);
					System.out.println("NOTA MODIFICADA");
				} else {
					System.out.println("ERROR DE MODIFICACION: LA NOTA DEBE ESTAR ENTRE 0-10");
				}
			}
		}
		System.out.println("NO EXISTE NOTA CON EL CODIGO: " + codigo + ".");
	}

	public double calcularPromedioNotasEstudiante() {
		Nota elementoNota = null;
		double sumaNotas = 0.0;
		double promedio = 0.0;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			sumaNotas += elementoNota.getCalificacion();
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

package com.epn.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	
	public Curso() {
		estudiantes=new ArrayList<Estudiante>();
	}

	// Getters and Setters

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	// Methods
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante;
		String resultado = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (estudiante.getCedula().equals(elementoEstudiante.getCedula())) {
				resultado = null;
			} else {
				resultado = "Estiudiante no esta dentro del curso";
			}
		}
		return resultado;
	}

	public void matricularEstudiantes(Estudiante estudiante) {
		String EstudianteActivo = buscarEstudiantePorCedula(estudiante);
		if (EstudianteActivo != null) {
			estudiantes.add(estudiante);
		} else {
			System.out.println("El estudiante ya existe en el sistema!");
		}
	}

	public double calcularPromedioCurso() {
		Estudiante estudiante;
		double sumaNotas = 0.0;
		double promedio;
		for (int i = 0; i < estudiantes.size(); i++) {
			estudiante = estudiantes.get(i);
			sumaNotas = sumaNotas + estudiante.calcularPromedioNotasEstudiante();
		}

		promedio = sumaNotas / estudiantes.size();
		return promedio;
	}

	public void mostrar() {
		Estudiante elementoEstudiante;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			System.out.println("Nombre: " + elementoEstudiante.getNombre() + ", Apellido: "
					+ elementoEstudiante.getApellido() + ", Cedula: " + elementoEstudiante.getCedula() + " Promedio: "
					+ elementoEstudiante.calcularPromedioNotasEstudiante());
		}
	}
}

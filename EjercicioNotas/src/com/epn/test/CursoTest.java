package com.epn.test;

import com.epn.entidades.Curso;
import com.epn.entidades.Estudiante;
import com.epn.entidades.Materia;
import com.epn.entidades.Nota;

public class CursoTest {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Materia sociales = new Materia("COD1", "Sociales");
		Materia matematicas = new Materia("COD2", "Matematicas");
		Materia lenguaje = new Materia("COD3", "Lenguaje");

		Estudiante estudiante = new Estudiante("1234567890", "Juan", "Perez");
		Estudiante estudiante2 = new Estudiante("12345678290", "Juan", "Perez");
		Estudiante estudiante3 = new Estudiante("0450165949", "Jorge", "Arellano");
		Nota nota1 = new Nota(sociales, 10.0);
		Nota nota2 = new Nota(matematicas, 10.0);
		Nota nota3 = new Nota(lenguaje, 10.0);

		Nota nota11 = new Nota(sociales, 5.0);
		Nota nota12 = new Nota(matematicas, 5.0);
		Nota nota13 = new Nota(lenguaje, 10.0);

		Nota nota14 = new Nota(sociales, 8.12);
		Nota nota15 = new Nota(matematicas, 8.5);
		Nota nota16 = new Nota(lenguaje, 8.9);

		System.out.println("----------------------------------------------");
		System.out.println("--------------REGISTRO DE NOTAS---------------");
		// Agrega 3 nuevas calificaciones a Estudiante 1
		estudiante.agregarNota(nota1);
		estudiante.agregarNota(nota2);
		estudiante.agregarNota(nota3);

		// Agrega 3 nuevas calificaciones a Estudiante 2
		estudiante2.agregarNota(nota11);
		estudiante2.agregarNota(nota12);
		estudiante2.agregarNota(nota13);

		// Agrega 3 nuevas calificaciones a Estudiante 3
		estudiante3.agregarNota(nota14);
		estudiante3.agregarNota(nota15);
		estudiante3.agregarNota(nota16);

		System.out.println("----------------------------------------------");
		System.out.println("------------REGISTRO DE MATRICULA-------------");

		curso1.matricularEstudiantes(estudiante);
		curso1.matricularEstudiantes(estudiante2);
		curso1.matricularEstudiantes(estudiante3);

		System.out.println("--------------------------------------------------------------");
		System.out.println("----------ESTUDIANTES QUE ACTUALMENTE TOMAN EL CURSO----------");

		System.out.println(curso1.getEstudiantes().size());

		System.out.println("----------------------------------------------");
		System.out.println("--------------PROMEDIO DEL CURSO---------------");
		System.out.println(curso1.calcularPromedioCurso());

		System.out.println("----------------------------------------------------");
		System.out.println("------------INFORMACION DE ESTUDIANTES---------------");
		curso1.mostrar();
	}

}

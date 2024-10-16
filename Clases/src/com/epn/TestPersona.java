package com.epn;

/*
 * Esto es un comentario de varias lineas;
 * 
 */
public class TestPersona {

	public static void main(String[] args) {
		Persona p; // Primero declaro una variable de tipo persona;
		Persona p2 = new Persona();
		p = new Persona();// 2. Instanciar el obketo, referenciarlo o asignarle una variable para acceder
							// a los atributos.

		// Accedo a los atributos
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edadPersona);
		System.out.println("estatura: " + p.estatura);

		System.out.println("---------------");
		// 4. Modificar los atributos
		p.nombre = "Mario";
		p.edadPersona = 45;
		p.estatura = 1.56;

		// Accedo a atributos
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edadPersona);
		System.out.println("estatura: " + p.estatura);

		p2.nombre = "Angelina";
		System.out.println("********");
		System.out.println("p.nombre: " + p.nombre);
		System.out.println("p2.nombre: " + p2.nombre);
		
		System.out.println("--------------------------");

		// 4. Modificar los atributos
		p.nombre = "Jorge";
		p.edadPersona = 18;
		p.estatura = 1.68;
		
		System.out.println("nombre: " + p.nombre);
		System.out.println("edad: " + p.edadPersona);
		System.out.println("estatura: " + p.estatura);

	}
}
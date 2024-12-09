package com.epn.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona>personas;
		personas= new ArrayList<Persona>();
		
		//Option 1
		
		//Persona p1= new Persona("Jorge", "Arellano");
		//personas.add(p1);
		
		//Option 2
		personas.add(new Persona("Aurelio", "Casillas"));
		personas.add(new Persona("Jose Maria", "Venegas"));
		personas.add(new Persona("Lencho", "Contreras"));
		
		Persona persona;
		for (int i=0; i<personas.size();i++) {
			persona=personas.get(i);
			System.out.println("Persona " + i);
			System.out.println("Nombre: "+persona.getNombre());
			System.out.println("Apellido: "+persona.getApellido());
		}
		

	}

}

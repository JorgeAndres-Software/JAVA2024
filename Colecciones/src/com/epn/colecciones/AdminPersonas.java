package com.epn.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	public AdminPersonas() {
		personas=new ArrayList<Persona>();
	}
	public void agregar(Persona persona) {
		personas.add(persona);
	}
	
	public void imoprimir() {
		Persona persona;
		for(int i=0; i<personas.size();i++) {
			persona=personas.get(i);
			System.out.println("Persona "+i);
			System.out.println("Nombre: "+persona.getNombre());
			System.out.println("Apellido: "+persona.getApellido());
			System.out.println("Edad: "+persona.getEdad());
			System.out.println("-------------------------------");
		}
	}
	
	/*public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada=null;
		for(int i=0;i<personas.size();i++) {
			personaEncontrada=personas.get(i);
			if(personaEncontrada.getNombre().equals(nombre)) {
				break; 
			}
		}
		return personaEncontrada;
	}
	*/
	public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada=null;
		Persona elementoPersona=null;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(elementoPersona.getNombre().equals(nombre)) {
				personaEncontrada=elementoPersona;
			}
		}
		return personaEncontrada;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores=new ArrayList<Persona>();
		Persona elementoPersona= null;
		
		for(int i=0; i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(elementoPersona.getEdad()>edad) {
				mayores.add(elementoPersona);
			}
			
		}
		return mayores;
	}
}

package com.epn.test;

import com.epn.composicion.Direccion;
import com.epn.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		
		//Antes de acceder a los bvalores, vamos a setearlos
		
		p1.setNombre("Rosario");
		p1.setApellido("Meneses");
		Direccion dir = new Direccion ();
		dir.setCallePrincipal("Av. America");
		dir.setCalleSecundaria("Colon");
		dir.setNumber("N-47");
		
		
		p1.setDireccion(dir);
		
		
		String nombre=p1.getNombre();
		Direccion d1= p1.getDireccion();	
		System.out.println("Nombre: "+nombre);
		//d1 esrta null y trato de invocar a aklgun metodo con esa variable;
		System.out.println(d1.getCallePrincipal());
		
		
		p1.imprimir();
	
		Persona p2= new Persona ();
		Direccion d2 = new Direccion("10 de Agosto", "Patria","S/N");
		p2.setNombre("Anita");
		p2.imprimir();
		
		
		Persona p3 = new Persona ();
		p3.setDireccion(new Direccion ("Rafael Arellano", "Manabi", "N-240"));
		p3.imprimir();

	}

}

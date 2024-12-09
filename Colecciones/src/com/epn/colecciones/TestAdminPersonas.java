package com.epn.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		
		AdminPersonas admin= new AdminPersonas();
		admin.agregar(new Persona("Pablo","Escobar",33));
		admin.agregar(new Persona("Chapo","Guzman",23));
		admin.agregar(new Persona("Amado","Carrillo",53));
		
		
		admin.imoprimir();
		
		Persona pEncontrada;
		pEncontrada=admin.buscarPorNombre("Chapo");
		
		if(pEncontrada!=null) {
			System.out.println("La persona que estas buscando coincide con: ");
			System.out.println("Nombre: "+pEncontrada.getNombre());
			System.out.println("Apellido: "+pEncontrada.getApellido());
			System.out.println("Edad: "+pEncontrada.getEdad());
			System.out.println("-------------------------------");
	
		}else {
			System.out.println("No se ha encontado una persona con el nombre ingresado");
		}
		
		ArrayList<Persona> personasMayores=admin.buscarMayores(15);
		System.out.println("Mayores: "+personasMayores.size());
		
	}
	
	

}

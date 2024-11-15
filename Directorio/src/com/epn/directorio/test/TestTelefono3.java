package com.epn.directorio.test;

import com.epn.directorio.entidades.AdminTelefono;
import com.epn.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono ("Movistar","0932546125",30);
		
		Telefono telf1 = new Telefono ("Movistar","0987954632",40);
		
		Telefono telf2 = new Telefono ("Claro","0978945631",50);
		
		AdminTelefono at = new AdminTelefono();
		
		int numerosMovi=at.contarMovil(telf1, telf2, telf);
		
		at.activarMensajeria(telf1);
		at.activarMensajeria(telf2);
		at.activarMensajeria(telf);
		
		telf1.imprimir();
		telf2.imprimir();
		telf.imprimir();
		
		System.out.println("Los numeros que pertenecen a movistar son: "+numerosMovi);
	}

}

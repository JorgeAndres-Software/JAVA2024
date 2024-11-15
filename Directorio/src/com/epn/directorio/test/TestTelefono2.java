package com.epn.directorio.test;

import com.epn.directorio.entidades.AdminTelefono;
import com.epn.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("Movistar","0986351247",20);
		
		// Instanciomos iun objeto adminTelefiono para no generar un nullPointerException
		AdminTelefono at = new AdminTelefono();
		//Se invoca al metodo activarMensajeria
		at.activarMensajeria(telf);
		
		telf.imprimir();

	}

}

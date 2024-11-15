package com.epn.directorio.test;

import com.epn.directorio.entidades.Contacto;
import com.epn.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("Movistar","0965325478",35);
		// Creaamos un objeto contacto
		Contacto c = new Contacto("Jorge","Arellano",telf,28.4);
		c.imprimir();
	}

}

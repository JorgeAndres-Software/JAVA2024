package com.epn.directorio.test;

import com.epn.directorio.entidades.AdminContactos;
import com.epn.directorio.entidades.AdminTelefono;
import com.epn.directorio.entidades.Contacto;
import com.epn.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf2 = new Telefono ("Claro","0978945631",50);
		Contacto c1 = new Contacto ("Jean", "Pierre", telf2,2.4);
		
		AdminTelefono am= new AdminTelefono();
		am.activarMensajeria(telf2);
		
		telf2.imprimir();
		
		AdminContactos ac = new AdminContactos();
		ac.activarUsuario(c1);
		
		c1.imprimir();
	}

}

package com.epn.directorio.test;

import com.epn.directorio.entidades.AdminContactos;
import com.epn.directorio.entidades.AdminTelefono;
import com.epn.directorio.entidades.Contacto;
import com.epn.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("Movistar", "0963225689", 57);
		Telefono telf1 = new Telefono("Movistar", "0987459631", 52);

		Contacto c1 = new Contacto("Pablo", "Escobar", telf, 5.2);
		Contacto c2 = new Contacto("Chapo", "Guzman", telf1, 10.8);
		
		AdminTelefono am = new AdminTelefono();
		
		am.activarMensajeria(telf1);
		am.activarMensajeria(telf);
				
		AdminContactos ac = new AdminContactos();
		ac.activarUsuario(c1);
		ac.activarUsuario(c2);
		Contacto mayor=ac.buyscarMasPesado(c1, c2);
		mayor.imprimir();
		
		boolean co=ac.compararOperadoras(c1, c2);
		
		System.out.println("Las operadoras de la informacion ingresada al sistema es : "+co);
	}

}

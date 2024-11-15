package com.epn.directorio.test;

import com.epn.directorio.entidades.AdminContactos;
import com.epn.directorio.entidades.Contacto;
import com.epn.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("Movistar", "0963254789", 593);
		Telefono telf1 = new Telefono("Claro", "0987456321", 57);

		Contacto c1 = new Contacto("Aurelio", "Casillas", telf, 20.2);
		Contacto c2 = new Contacto("Chacorta", "Casillas", telf1, 25.2);
		
		AdminContactos ac = new AdminContactos();
		Contacto mayor=ac.buyscarMasPesado(c1, c2);
		mayor.imprimir();
		
		boolean co=ac.compararOperadoras(c1, c2);
		System.out.println("Las operadoras de la informacion ingresada al sistema es : "+co);

	}

}

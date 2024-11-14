package com.epn.repaso.entidades;

public class Validacion {
	
	public boolean validarMonto(double monto) {
		// Se crea un IF para validar la funcion
		
		if(monto>=0) {
			System.out.println("True");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
		
	}
}

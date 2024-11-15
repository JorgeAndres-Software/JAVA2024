package com.epn.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora()=="Movistar") {
			telefono.setTieneWhatsApp(true);
		}
	}
	
	public int contarMovil(Telefono telf1, Telefono telf2, Telefono telf3) {
		
		int numerosMovi=0;
		boolean esMovi=false;
		
		if(telf1.getOperadora()=="Movistar") {
			esMovi=true;
			if(esMovi == true) {
				numerosMovi+=1;
			}
		}
		
		if(telf2.getOperadora()=="Movistar") {
			esMovi=true;
			if(esMovi == true) {
				numerosMovi+=1;
			}
		}
		
		if(telf3.getOperadora()=="Movistar") {
			esMovi=true;
			if(esMovi == true) {
				numerosMovi+=1;
			}
		}
		
		return numerosMovi;
	}
}

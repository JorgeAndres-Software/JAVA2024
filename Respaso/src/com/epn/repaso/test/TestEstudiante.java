package com.epn.repaso.test;

import com.epn.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancio el objeto con el constructor pior parametros
		
		Estudiante e1 = new Estudiante("Jorge");
		
		//Accedo a e1
		
		e1.calificar(10);
		e1.calificar(7);

	}

}

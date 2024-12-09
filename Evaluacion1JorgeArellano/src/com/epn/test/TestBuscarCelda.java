package com.epn.test;

import com.epn.componentes.Celda;

import com.epn.maquina.MaquinaDulces;

public class TestBuscarCelda {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		Celda celda = maquina.buscarCelda("C");
		System.out.println("Celda Encontrada: " + celda.getCodigo());
		Celda celda2 = maquina.buscarCelda("F");

		System.out.println("No existe la celda buscada");

	}

}

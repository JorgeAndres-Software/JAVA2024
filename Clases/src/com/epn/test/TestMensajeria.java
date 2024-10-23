package com.epn.test;

import com.epn.Mensajeria;

public class TestMensajeria {

	public static void main(String[] args) {
		Mensajeria a;
		a= new Mensajeria();
		a.saludar();
		System.out.println("---------------------");
		a.salduarAmigo("Jorge","Arellano");
	}

}

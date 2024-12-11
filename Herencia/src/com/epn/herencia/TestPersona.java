package com.epn.herencia;

public class TestPersona {

	public static void main(String[] args) {
		Persona p = new Persona("0450165949","Jorge");
		System.out.println(p.toString());
		
		System.out.println("Hola");
		System.out.println(p);//LLamado interno a p.toString
		
		Cuenta c1= new Cuenta("2215496384",20);
		System.out.println(c1.toString());
		

	}

}

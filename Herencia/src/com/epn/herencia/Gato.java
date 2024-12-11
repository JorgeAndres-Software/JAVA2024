package com.epn.herencia;

public class Gato extends Animal {
	@Override
	public void dormir() {
		System.out.println("Gato durmiendo");
	}
	
	public void maullar(String adjetivo) {
		System.out.println("Gato maullando "+adjetivo);
	}
	public void maullar() {
		System.out.println("Gato maullando ");
	}
	
}

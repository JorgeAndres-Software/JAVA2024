package com.epn;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		calcu=new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(8,3);
		
		System.out.println("Resultado Suma: "+resultadoSuma );
		System.out.println("------------------------------------");
		System.out.println("Resultado Resta: "+resultadoResta );

	}

}

package com.epn;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double producto;
		double cociente;
		double promedio;
	
		calcu=new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(8,3);
		producto=calcu.multiplicar(10,5);
		cociente=calcu.dividir(10, 2);
		promedio=calcu.promediar(10, 9, 8);
		
		
		
		System.out.println("Resultado Suma: "+resultadoSuma );
		System.out.println("------------------------------------");
		System.out.println("Resultado Resta: "+resultadoResta );
		System.out.println("------------------------------------");
		System.out.println("Producto: "+producto);
		System.out.println("------------------------------------");
		System.out.println("Cociente: "+cociente);
		System.out.println("------------------------------------");
		System.out.println("Promedio: "+promedio);
		System.out.println("------------------------------------");
		calcu.mostrarResultado();
		
		

	}

}

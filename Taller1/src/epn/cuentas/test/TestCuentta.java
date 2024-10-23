package epn.cuentas.test;

import epn.cuentas.Cuenta;

public class TestCuentta {

	public static void main(String[] args) {

		// Creo el objeto Cuenta y lo referencio con cuenta1;
		Cuenta c1 = new Cuenta("03476");
		// Creo el objeto Cuenta y lo referencio con cuenta2;
		Cuenta c2 = new Cuenta("03476", "C", 98);
		// Creo el objeto Cuenta y lo referencio con cuenta3;
		Cuenta c3 = new Cuenta("03476");
		
		//More Accounts to create
		Cuenta c4= new Cuenta ("09872");
		c4.setSaldo(10);
		
		Cuenta c5 = new Cuenta("05578","C",10);
		
		Cuenta c6 = new Cuenta("06668");

		// Coloco un valor de salodo en la cuenta1
		c1.setSaldo(675);

		// Modifico el tipo de cuenta 3;
		c3.setTipo("C");

		// Print Accounts

		System.out.println("-----Valores Iniciales----");
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();

		System.out.println("--------------------------");

		System.out.println("----Valores Modificados---");
		// Modificar Atributios
		c1.setSaldo(144);
		c2.setTipo("D");
		c3.setSaldo(567);
		
		//Print Accounts Again
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		
		// Print Accounts with my method
		c4.imprimirConMiEstilo();
		c5.imprimirConMiEstilo();;
		c6.imprimirConMiEstilo();;
	}

}

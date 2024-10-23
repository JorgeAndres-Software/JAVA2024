package epn.cuentas;

public class Cuenta {

	// Se aplica el principio de encapsulamiento;

	private String id;
	private String tipo = "A";
	private double saldo;

	// Default

	public Cuenta(String id) {
		this.id = id;
	}

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	// Getters and Setters

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Methods
	public void imprimir() {
		System.out.println("***********************");
		System.out.println("CUENTA");
		System.out.println("***********************");
		System.out.println("Numero de Cuenta: " + id);
		System.out.println("Tipo: " + tipo);
		System.out.println("Saldo: USD " + saldo);
	}

	public void imprimirConMiEstilo() {
		System.out.println("---------------------------------");
		System.out.println("-------Estado Bancario-----------");
		System.out.println("Número de cuenta: " + id);
		System.out.println("Tipo de cuenta: " + tipo);
		System.out.println("Saldo: $" + saldo);
	}

}

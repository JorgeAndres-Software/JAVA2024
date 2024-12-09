package com.epn.ant;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter; //Fecha actual del sistema

import com.epn.ct.Revisor;
import com.epn.user.Propietario;
import com.epn.user.Vehiculo;

public class InicioANT {
	static Scanner scanner = new Scanner(System.in);
	static Propietario propietario;
	static Revisor revisor;
	private static Vehiculo vehiculoRegistrado = null;

	// Credenciales predefinidas
	static final String ADMIN_USER = "admin";
	static final String ADMIN_PASS = "admin123";

	private static void inicializarDatos() {
		vehiculoRegistrado = new Vehiculo("ABC-1234", "Toyota", "Corolla", 2020, 85.0, 90.0, 87.5, 89.0, 75.0, 80.0,
				4.5, true, false);
		propietario = new Propietario("Juan Perez", "1234567890");
		propietario.asignarVehiculo(vehiculoRegistrado);
		revisor = new Revisor("Carlos Gómez", "9876543210");
	}

	// Obtener la fecha actual
	static LocalDate fechaActual = LocalDate.now();
	// Obtener la hora actual
	static LocalTime horaActual = LocalTime.now();

	static // Formatear la fecha
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	static String fechaFormateada = fechaActual.format(formatoFecha);

	static // Formatear la hora
	DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
	static String horaFormateada = horaActual.format(formatoHora);

	public static void main(String[] args) {
		inicializarDatos();

		while (true) {
			try {
				System.out.println("\n=== Sistema de Revisión Vehicular de la ANT ===");
				System.out.println("La Agencia Nacional de Transito trabajando por su seguridad...");
				System.out.println("-------------------------------------------------");
				System.out.println("Hora de Ingreso: " + horaFormateada);
				System.out.println("Fecha de Ingreso: " + fechaFormateada);
				System.out.println("-------------------------------------------------");
				System.out.println("1. Ingresar como Propietario");
				System.out.println("2. Ingresar como Revisor");
				System.out.println("3. Salir");
				System.out.print("Seleccione una opción: ");
				int opcion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el buffer

				switch (opcion) {
				case 1:
					System.out.println(
							"================================================================================");
					System.out.println(
							"Tome en cuenta que la revisión vehicular es un proceso obligatorio que se realiza anualmente ");
					System.out.println(
							"para garantizar que los vehículos cumplan con los estándares técnicos y ambientales.");
					System.out.println();
					System.out.println(
							"Segun la Ley Orgánica de Transporte Terrestre,Tránsito y Seguridad Vial (particularmente el Artículo 85) ");
					System.out.println("señala que para pasar la revision se debe cumplir lo siguiente:");
					System.out
							.println("-------------------------------------------------------------------------------");
					System.out.println("Temperatura Motor: (minima 70 C°) y (maxima 110 C°). ");
					System.out.println("Eficiencia de frenos: (minimo 70%) y (maxima 100%).");
					System.out.println("Equilibrio de frenos: (Debe superar el 20%). ");
					System.out.println("Ruido de escape: (No debe superar los 95dB).");
					System.out.println("Emisiones de gases: (minimo 3%) y (maximo 5%) de emision de CO2.");
					System.out.println("Profundidad del labrado: (minimo 1.66mm de profundidad).");
					System.out.println("Eficiencia del amortiguador: (minimo 35%) y (maximo 100%)");
					System.out.println("El vehiculo no debe presentar fugas de aceite en la revision.");
					System.out.println(
							"El vehiculo no debe presentar daños estructurales significativos en la revision.");
					System.out.println(
							"================================================================================");

					System.out.println("Ingrese su numero de placa: ");
					String placa = scanner.nextLine();
					if (vehiculoRegistrado.getPlaca().equals(placa)) {
						System.out.println("-------Informacion del vehiculo----");
						System.out.println("Provincia: " + obtenerProvincia(placa));
						System.out.println("Tipo de Vehiculo: " + tipoDeVehiculo(placa));
						System.out.println("Fecha de matricula: " + obtenerFechaMatricula(placa));
						System.out.println("------------------------------------");
						System.out.println("------Detalles de la Inspeccion----");
						System.out.println(vehiculoRegistrado.detallesInspeccion());
						System.out.println("----------Problemas Encontrados-----");
						System.out.println(vehiculoRegistrado.obtenerErrores());
						System.out.println("------------AGENTE ASIGNADO---------");
						System.out.println("Revisor: "+revisor.getNombre());
					} else {
						System.out.println(
								"Vehiculo no registrado previamente por un agente de la ANT o se produjo un error en el ingreso de la placa.");
						System.out.println("Por favor ingrese nuevamente...");
						System.out.println();
					}
					break;
				case 2:
					if (autenticar(ADMIN_USER, ADMIN_PASS)) {
						menuRevisor();
					} else {
						System.out.println("Credenciales incorrectas.");
						System.out.println();
					}
					break;
				case 3:
					System.out.println();
					System.out.println("¡Gracias por usar el sistema!");

					return;
				default:
					System.out.println();
					System.out.println("Opción inválida. Intente de nuevo.");

				}
			} catch (InputMismatchException io) {
				System.out.println("\nError: Debe ingresar un digito del 1 al 3");
				scanner.nextLine(); // Limpiar el buffer
			}

		}
	}

	private static boolean autenticar(String usuarioEsperado, String contrasenaEsperada) {
		System.out.print("Ingrese su usuario: ");
		String usuario = scanner.nextLine();
		System.out.print("Ingrese su contraseña: ");
		String contrasena = scanner.nextLine();

		return usuario.equals(usuarioEsperado) && contrasena.equals(contrasenaEsperada);
	}

	private static void registrarVehiculoRevisor() {
		System.out.println("=== Registrar Vehículo ===");
		try {
			System.out.print("Ingrese la placa: ");
			String placa = scanner.nextLine();

			// Esta seccion de codigo fue creada para validar la estructura de la placa

			String errores = "";
			int longitud = placa.length();

			char digito1 = placa.charAt(0);
			// System.out.println(digito1);
			char digito2 = placa.charAt(1);
			// System.out.println(digito2);
			char digito3 = placa.charAt(2);
			// System.out.println(digito3);
			char digito4 = placa.charAt(3);
			// System.out.println(digito4);
			char digito5 = placa.charAt(4);
			// System.out.println(digito5);
			char digito6 = placa.charAt(5);
			// System.out.println(digito6);
			char digito7 = placa.charAt(6);
			// System.out.println(digito7);
			char digito8;

			boolean existenErrores = false;

			if (longitud < 7 || longitud > 8) {
				existenErrores = true;
				errores = "\n -La logitud de la placa debe contener 7 u 8 caracteres.";
			} else {
				// No Available error message;
			}

			if (esMayuscula(digito1) == false) {
				existenErrores = true;
				errores = errores + "\n -El primer caracter debe contener una letra mayuscula.";
			} else {
				// No available error message;
			}

			if (esMayuscula(digito2) == false) {
				existenErrores = true;
				errores = errores + "\n -El segundo caracter debe contener una letra mayuscula.";
			} else {
				// No available error message
			}

			if (esMayuscula(digito3) == false) {
				existenErrores = true;
				errores = errores + "\n -El tercer caracter debe contener una letra mayuscula.";
			} else {
				// No available error message
			}

			if (esGuion(digito4) == false) {
				existenErrores = true;
				errores = errores + "\n -El cuarto caracter debe contener un guion.";
			} else {
				// No available error message
			}

			if (esInt(digito5) == false) {
				existenErrores = true;
				errores = errores + "\n -El quinto caracter debe ser un digito.";
			} else {
				// No available error message;
			}

			if (esInt(digito6) == false) {
				existenErrores = true;
				errores = errores + "\n -El sexto caracter debe ser un digito.";
			} else {
				// No available error message;
			}

			if (esInt(digito7) == false) {
				existenErrores = true;
				errores = errores + "\n -El septimo caracter debe ser un digito.";
			} else {
				// No available error message;
			}

			if (longitud == 8) {
				digito8 = placa.charAt(7);
				if (esInt(digito8) == false) {
					existenErrores = true;
					errores = errores + "\n -El quinto caracter debe ser un digito.";
				} else {
					// No available error message;
				}
			}

			if (existenErrores == false) {
				System.out.print("Ingrese la marca: ");
				String marca = scanner.nextLine();
				System.out.print("Ingrese el modelo: ");
				String modelo = scanner.nextLine();
				System.out.print("Ingrese el año: ");
				int anio = scanner.nextInt();
				scanner.nextLine(); // Limpiar buffer

				// Crear propietario
				System.out.print("Ingrese el nombre del propietario: ");
				String nombrePropietario = scanner.nextLine();
				System.out.print("Ingrese el ID del propietario: ");
				String idPropietario = scanner.nextLine();
				Propietario propietario = new Propietario(nombrePropietario, idPropietario);

				// Crear y registrar el vehículo
				vehiculoRegistrado = new Vehiculo(placa, marca, modelo, anio);
				propietario.asignarVehiculo(vehiculoRegistrado);

				System.out.println("Vehículo registrado con éxito.");
				System.out.println("******************************");
				System.out.println("Propietario asignado: " + propietario.informacionPerfil());
			} else {
				System.out.println(errores);
			}

		} catch (StringIndexOutOfBoundsException ios) {
			System.out.println("\n La placa debe contener al menos 7 digitos.");
			scanner.nextLine();// Limpiar el bufer
		}

	}

	// Fin de la seccion creada para la estructura de la placa;

	private static void realizarRevisionRevisor() {
		System.out.println("=== Realizar Revisión ===");
		System.out.print("Ingrese la placa del vehículo a revisar: ");
		String placa = scanner.nextLine();

		// Buscar vehículo por placa (simulación sin listas ni arreglos)
		Vehiculo vehiculo = buscarVehiculoPorPlaca(placa);
		if (vehiculo == null) {
			System.out.println("Vehículo no encontrado. Por favor registre primero el vehículo.");
			return;
		}

		// Realizar la revisión
		revisor.realizarRevision(vehiculo);
	}

	private static Vehiculo buscarVehiculoPorPlaca(String placa) {
		// Verificar si el vehículo registrado tiene la misma placa
		if (vehiculoRegistrado != null && vehiculoRegistrado.getPlaca().equals(placa)) {
			return vehiculoRegistrado;
		}
		return null;
	}

	private static void menuRevisor() {
		while (true) {
			System.out.println("\n=== Menú Revisor (ANT) ===");
			System.out.println("1. Registrar un nuevo vehículo");
			System.out.println("2. Realizar revision de un vehiculo");
			System.out.println("3. Regresar al menú principal");
			System.out.print("Seleccione una opción: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				registrarVehiculoRevisor();

				break;
			case 2:
				realizarRevisionRevisor();
				return;
			case 3:
				return;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
			}
		}
	}

	// Funciones Adicionales
	public static boolean esMayuscula(char letra) {
		boolean esMayuscula = false;
		int caracter1 = (int) letra;

		if (caracter1 >= 65 && caracter1 <= 90) {
			esMayuscula = true;
		} else {
			esMayuscula = false;
		}

		return esMayuscula;
	}

	public static boolean esInt(char letra) {
		boolean esEntero = false;
		int caracter = (int) letra;
		if (caracter >= 48 && caracter <= 57) {
			esEntero = true;
		} else {
			esEntero = false;
		}

		return esEntero;
	}

	public static boolean esGuion(char especial) {
		boolean esEspecial = false;
		int caracter = (int) especial;
		if (caracter == 45) {
			esEspecial = true;
		} else {
			esEspecial = false;
		}

		return esEspecial;
	}

	public static String obtenerProvincia(String placa) {
		String obtenerProvincia = "";
		char caracter = placa.charAt(0);
		String caracterNuevo = String.valueOf(caracter);

		if (caracterNuevo.equals("A")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia del Azuay.";
			return obtenerProvincia;

		} else if (caracterNuevo.equals("B")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Bolivar.";
			return obtenerProvincia;

		} else if (caracterNuevo.equals("U")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Cañar.";
			return obtenerProvincia;

		} else if (caracterNuevo.equals("C")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia del Carchi.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("X")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Cotopaxi.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("H")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Chimborazo.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("O")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de El Oro.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("E")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Esmeraldas.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("W")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Galapagos.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("G")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia del Guayas.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("I")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Imbabura.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("L")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Loja.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("R")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Los Rios.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("M")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Manabi.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("V")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Morona Santiago.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("N")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Napo.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("S")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Pastaza.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("P")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Pichincha.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("K")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Sucumbios.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("Q")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Orellana.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("T")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Tungurahua.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("Z")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Zamora Chinchipe.";
			return obtenerProvincia;
		} else if (caracterNuevo.equals("Y")) {
			obtenerProvincia = "El vehiculo pertenece a la provincia de Santa Elena.";
			return obtenerProvincia;
		} else {
			return null;
		}
	}

	public static String tipoDeVehiculo(String placa) {
		String obtenerTipo = "";
		char caracter = placa.charAt(1);
		String segundaLetra = String.valueOf(caracter);
		if (segundaLetra.endsWith("A") || segundaLetra.equals("Z")) {
			obtenerTipo = "Vehiculos comerciales (taxis o autobuses).";
			return obtenerTipo;

		} else if (segundaLetra.equals("E")) {
			obtenerTipo = "Vehiculos gubernamentales.";
			return obtenerTipo;
		} else if (segundaLetra.equals("X")) {
			obtenerTipo = "Vehiculos de uso oficial.";
			return obtenerTipo;
		} else if (segundaLetra == "S") {
			obtenerTipo = "Vehiculos del gobierno provincial.";
			return obtenerTipo;
		} else if (segundaLetra.equals("M")) {
			obtenerTipo = "Vehiculos municipales.";
			return obtenerTipo;

		} else if (segundaLetra != "E" && segundaLetra != "M" && segundaLetra != "S" && segundaLetra != "X"
				&& segundaLetra != "E" && segundaLetra != "A" && segundaLetra != "Z") {
			obtenerTipo = "Vehiculo particular (privado).";
			return obtenerTipo;
		} else {
			return null;
		}
	}

	public static String obtenerFechaMatricula(String placa) {
		String obtenerFecha = "";
		char caracter = placa.charAt(placa.length() - 1);
		String caracterNuevo = String.valueOf(caracter);
		if (caracterNuevo.equals("0")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 30 de Noviembre";
			return obtenerFecha;
		} else if (caracterNuevo.equals("1")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 28 de Febrero";
			return obtenerFecha;
		} else if (caracterNuevo.equals("2")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 31 de Marzo";
			return obtenerFecha;
		} else if (caracterNuevo.equals("3")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 30 de Abril";
			return obtenerFecha;
		} else if (caracterNuevo.equals("4")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 31 de Mayo";
			return obtenerFecha;
		} else if (caracterNuevo.equals("5")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 30 de Junio";
			return obtenerFecha;
		} else if (caracterNuevo.equals("6")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 31 de Julio";
			return obtenerFecha;
		} else if (caracterNuevo.equals("7")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 31 de Agosto";
			return obtenerFecha;
		} else if (caracterNuevo.equals("8")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 30 de Septiembre";
			return obtenerFecha;
		} else if (caracterNuevo.equals("9")) {
			obtenerFecha = "Su vehiculo esta habilitado para matricular desde el 01 hasta el 31 de Octubre";
			return obtenerFecha;
		} else {
			return null;
		}

	}

}

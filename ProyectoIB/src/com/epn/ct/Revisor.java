package com.epn.ct;

import java.util.Scanner;

import com.epn.user.Propietario;
import com.epn.user.Vehiculo;


public class Revisor {
    private String nombre;
    private String idRevisor;

    public Revisor(String nombre, String idRevisor) {
        this.nombre = nombre;
        this.idRevisor = idRevisor;
    }
    

    public Vehiculo registrarVehiculo(String placa, String marca, String modelo, int anio, Propietario propietario) {
        Vehiculo nuevoVehiculo = new Vehiculo(placa, marca, modelo, anio);
        propietario.asignarVehiculo(nuevoVehiculo); // Asignar vehículo al propietario
        System.out.println("El vehículo con placa " + placa + " ha sido registrado y asignado al propietario.");
        return nuevoVehiculo;
    }

    public void realizarRevision(Vehiculo vehiculo) {
        System.out.println("=== Iniciando revisión del vehículo con placa: " + vehiculo.getPlaca() + " ===");

        Scanner scanner = new Scanner(System.in);

        // Ingresar los aspectos de la revisión
        System.out.print("Ingrese la temperatura del motor (80-120): ");
        vehiculo.setTemperaturaMotor(scanner.nextDouble());
        System.out.print("Ingrese la eficiencia de los frenos (0-100): ");
        vehiculo.setEficienciaFrenos(scanner.nextDouble());
        System.out.print("Ingrese las emisiones de gases (0-150): ");
        vehiculo.setEmisionesGases(scanner.nextDouble());
        System.out.print("¿Tiene fugas de aceite? (true/false): ");
        vehiculo.setFugasAceite(scanner.nextBoolean());
        System.out.print("¿Tiene daños estructurales? (true/false): ");
        vehiculo.setEstructuraDanios(scanner.nextBoolean());

        // Verificar si pasa la revisión
        vehiculo.verificarRevision();
        if (vehiculo.isPasoRevision()) {
            System.out.println("El vehículo ha pasado la revisión con éxito.");
        } else {
            System.out.println("El vehículo NO pasó la revisión.");
            System.out.println("Errores encontrados:");
            System.out.println(vehiculo.obtenerErrores());
        }
    }

    public String informacionPerfil() {
        return "Revisor: " + nombre + "\nID: " + idRevisor;
    }
    
  
}
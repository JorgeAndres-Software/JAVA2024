package com.epn.user;

public class Propietario {
    private String nombre;
    private String idPropietario;
    private Vehiculo vehiculo;

    public Propietario(String nombre, String idPropietario) {
        this.nombre = nombre;
        this.idPropietario = idPropietario;
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String informacionPerfil() {
        return "Nombre: " + nombre + "\nID: " + idPropietario + "\nVehículo Asignado: " + (vehiculo != null ? vehiculo.detallesCarro() : "No asignado");
    }
}
	
	


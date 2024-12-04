package com.epn.user;

import com.epn.ct.Revisor;

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
        return "Nombre: " + nombre + "\nID: " + idPropietario + "\nVehículo Asignado: " + (vehiculo != null ? vehiculo.detallesInspeccion() : "No asignado");
    }

    public String consultarResultado(Revisor revisor) {
        return vehiculo.isPasoRevision() ? "El vehículo pasó la revisión." : "El vehículo no pasó la revisión." +vehiculo.obtenerErrores();
       
    }
}
	
	


package com.epn.user;

import java.util.Scanner;

public class Vehiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int anio;
	private double temperaturaMotor;
	private double eficienciaFrenos;
	private double equilibrioFrenos;
	private double ruidoEscape;
	private double emisionesGases;
	private double profundidadLabrado;
	private double eficaciaAmortiguador;
	private boolean fugasAceite;
	private boolean estructuraDanios;
	private boolean pasoRevision;

	// Getters and Setters
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getTemperaturaMotor() {
		return temperaturaMotor;
	}

	public void setTemperaturaMotor(double temperaturaMotor) {
		this.temperaturaMotor = temperaturaMotor;
	}

	public double getEficienciaFrenos() {
		return eficienciaFrenos;
	}

	public void setEficienciaFrenos(double eficienciaFrenos) {
		this.eficienciaFrenos = eficienciaFrenos;
	}

	public double getEquilibrioFrenos() {
		return equilibrioFrenos;
	}

	public void setEquilibrioFrenos(double equilibrioFrenos) {
		this.equilibrioFrenos = equilibrioFrenos;
	}

	public double getEmisionesGases() {
		return emisionesGases;
	}

	public void setEmisionesGases(double emisionesDeGases) {
		this.emisionesGases = emisionesDeGases;
	}

	public double getRuidoEscape() {
		return ruidoEscape;
	}

	public void setRuidoEscape(double ruidoEscape) {
		this.ruidoEscape = ruidoEscape;
	}

	public double getEficaciaAmortiguador() {
		return eficaciaAmortiguador;
	}

	public void setEficaciaAmortiguador(double eficaciaAmortiguador) {
		this.eficaciaAmortiguador = eficaciaAmortiguador;
	}

	public boolean isFugasAceite() {
		return fugasAceite;
	}

	public void setFugasAceite(boolean fugasAceite) {
		this.fugasAceite = fugasAceite;
	}

	public void setPasoRevision(boolean pasoRevision) {
		this.pasoRevision = pasoRevision;
	}

	public double getProfundidadLabrado() {
		return profundidadLabrado;
	}

	public void setProfundidadLabrado(double profundidadLabrado) {
		this.profundidadLabrado = profundidadLabrado;
	}


	public boolean isEstructuraDanios() {
		return estructuraDanios;
	}

	public void setEstructuraDanios(boolean estructuraDanios) {
		this.estructuraDanios = estructuraDanios;
	}

	// Constructor

	public Vehiculo(String placa, String marca, String modelo, int anio, double temperaturaMotor,
			double eficienciaFrenos, double equilibrioFrenos, double eficaciaAmortiguador, double ruidoEscape,
			double emisionesGases, double profundidadLabrado, boolean fugasAceite, boolean estructuraDanios) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.temperaturaMotor = temperaturaMotor;
		this.eficienciaFrenos = eficienciaFrenos;
		this.equilibrioFrenos = equilibrioFrenos;
		this.eficaciaAmortiguador = eficaciaAmortiguador;
		this.ruidoEscape = ruidoEscape;
		this.emisionesGases = emisionesGases;
		this.profundidadLabrado = profundidadLabrado;
		this.fugasAceite = fugasAceite;
		this.estructuraDanios = estructuraDanios;
		this.pasoRevision = false;
	}
	

	public Vehiculo(String placa, String marca, String modelo, int anio) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;


}
//Methods

	public void verificarRevision() {
		this.pasoRevision = temperaturaMotor >= 70 && eficienciaFrenos >= 70 && emisionesGases <= 5 && equilibrioFrenos>= 20 && ruidoEscape <= 95 && profundidadLabrado >= 1.6 && eficaciaAmortiguador >= 35 && !fugasAceite
				&& !estructuraDanios;
	}
	
	public String obtenerErrores() {
        StringBuilder errores = new StringBuilder();

        if (temperaturaMotor < 70 || temperaturaMotor > 110) {
            errores.append("\nLa temperatura del motor no está en el rango permitido (70-110) °C.\n");
        }
        if (eficienciaFrenos < 70) {
            errores.append("\nLa eficiencia de los frenos es insuficiente (<70 %).\n");
        }
        if (emisionesGases > 5) {
            errores.append("\nLas emisiones de gases superan el límite permitido (>5 %).\n");
        }
		if (ruidoEscape>95){
			errores.append("\nEl ruido de escape no está en el rango permitido (>=95 dB).\n");
		}
		if (equilibrioFrenos<20)	{
			errores.append("\nEl equilibrio de frenos es insuficiente (<20%).\n");
		}
		if (profundidadLabrado <1.6) {
			errores.append("\nLa profundidad del labrado no está en el rango permitido (<1.6 mm).\n");
		}
		if (eficaciaAmortiguador<35){
			errores.append("\nLa eficacia del amortiguador no se encuentra en el rango permitido (<35%).\n");
		}
        if (fugasAceite) {
            errores.append("\nEl vehículo tiene fugas de aceite.\n");
        }
        if (estructuraDanios) {
            errores.append("\nEl vehículo presenta daños estructurales.\n");
        }

        if (errores.length() == 0) {
            errores.append("\nEl vehículo ha pasado la revisión y puede seguir circulando.");
        }

        return errores.toString();
    }

	public boolean isPasoRevision() {
		return pasoRevision;
	}

	public String detallesInspeccion() {
		return "Placa: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio
				+ "\nTemperatura Motor: " + temperaturaMotor +" °C "+ "\nEficiencia Frenos: " + eficienciaFrenos + " % "
				+ "\nEquilibrio Frenos: " + equilibrioFrenos + " % "+"\nEficacia Amortiguador: " + eficaciaAmortiguador + " % "
				+ "\nRuido Escape: " + ruidoEscape + " dB "+"\nEmisiones Gases: " + emisionesGases + " % "+ "\nProfundidad Labrado: "
				+ profundidadLabrado + " mm "+ "\nFugas Aceite: " + (fugasAceite ? "Sí" : "No") + "\nEstructura Daños: "
				+ (estructuraDanios ? "Sí" : "No") + "\n¿Pasó la revisión?: " + (pasoRevision ? "Sí" : "No");
	}
	

	public String detallesCarro() {
		return "Placa: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo + "\nAño: " + anio;
	}

	}



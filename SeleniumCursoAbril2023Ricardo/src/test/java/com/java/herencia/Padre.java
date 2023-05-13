package com.java.herencia;

public class Padre {
	
	// States
	private String colorOjos, colorCabello, colorPiel;
	double estatura;
	
	public Padre(String colorOjos, String colorCabello, String colorPiel, double estatura) {
		this.colorOjos = colorOjos;
		this.colorCabello = colorCabello;
		this.colorPiel = colorPiel;
		this.estatura = estatura;
	}
	
	// Behaviour
	
	public void jugarFutbol() {
		System.out.println("Jugar Futbol");
	}
	
	// GETTERS & SETTERS
	

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public String getColorCabello() {
		return colorCabello;
	}

	public void setColorCabello(String colorCabello) {
		this.colorCabello = colorCabello;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	

}

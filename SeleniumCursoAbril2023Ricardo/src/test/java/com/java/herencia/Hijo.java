package com.java.herencia;

public class Hijo extends Padre{

	public Hijo(String colorOjos, String colorCabello, String colorPiel, double estatura) {
		super(colorOjos, colorCabello, colorPiel, estatura);
	}

	public void jugarBaseball() {
		System.out.println("Jugar Baseball");
	}

}

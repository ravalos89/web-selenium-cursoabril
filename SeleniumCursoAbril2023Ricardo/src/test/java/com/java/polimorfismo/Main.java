package com.java.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Animal olimpia = new Gato();
		olimpia.speak();
		
		olimpia = new Perro();
		olimpia.speak();
		
		olimpia = new Humano();
		olimpia.speak();

	}

}

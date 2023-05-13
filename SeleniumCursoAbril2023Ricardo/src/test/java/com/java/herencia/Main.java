package com.java.herencia;

public class Main {

	public static void main(String[] args) {
		Padre padre = new Padre("Cafe", "Negro", "Moreno", 1.78);
		
		padre.jugarFutbol();
		
		padre.setColorOjos("Rojo");
		
		System.out.println("Que color de ojos tiene el PAdre? "+ padre.getColorOjos());
		
		Hijo hijo = new Hijo("Cafe", "Cafe", "Moreno", 1.80);
		
		hijo.jugarBaseball();
		hijo.jugarFutbol();
		
		Nieto nieto = new Nieto("Negro", "Negro", "Blanco", 1.75);
		nieto.jugarBaseball();
		nieto.jugarFutbol();

	}

}

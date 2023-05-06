package com.java;

public class Ejercicio1Conduciendo {

	public static void main(String[] args) {
		// Conditional statement - IF
		
//		IF
//		
//		IF ELSE
//		
//		IF ELSE IF
//		
//		IF ANIDADO - NESTED IF
		
		// ¿A que velocidad estoy conduciendo?
		int velocidad = 90;
		
		// ¿Cual es el limite de velocidad?
		int limiteVelocidad = 80;
		
		// ¿En donde esta instalado el dispositivo?
		boolean isCarretera = true;
		
		if(isCarretera==true) {
			limiteVelocidad = 100;
			// Dispositivo
			if(velocidad>limiteVelocidad) {
				System.out.println("MULTA!!!");
			}else {
				System.out.println("PREMIO!!!");
			}
		} else if(isCarretera==false) {
			// Dispositivo
			if(velocidad>limiteVelocidad) {
				System.out.println("MULTA!!!");
			}else {
				System.out.println("PREMIO!!!");
			}
		}
		
		// EJERCICIO #1
		
//		Agregar a el ejercicio de el dispositivo de limite de velocidad la condicion
//		de Zona Escolar
		
		// EJERCICIO #2
//		Crear un Glosario de Nombres utilizando el switch para 10 letras
		
		// SWITCH
		
		// Glosario de Frutas
		
		String inicialFruta = "U";
		
		switch(inicialFruta) {
		case "M":
			System.out.println("Manzana, Mango, Mandarina");
			break;
			
		case "S":
			System.out.println("Sandia");
			break;
			
		case "N":
			System.out.println("Naranja");
			break;
			
		default:
			System.out.println("No se encontraron frutas con esa letra");
			break;
		}
		
		
		

	}
	
	public static void sayHello2() {
		System.out.println("Hello");			
	}

}

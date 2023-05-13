package com.java;

import com.java.ejercicios.Modifier;

public class Main {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Chihuahua", "Small", 5, "Cafe", 100);
//		dog1.breed = "Chihuahua";
//		dog1.size = "Small";
//		dog1.age = 5;
//		dog1.color = "Cafe";
//		dog1.patas = 1000000;
//		dog1.eat();
//		dog1.run();
		
		Dog dog3 = new Dog();
		
		System.out.println("El color de mi Dog 1 es: " + dog1.color);
		System.out.println("Mi Perro "+dog1.breed + " tiene "+dog1.patas +" patas");
		
//		Dog dog2 = new Dog();
//		dog2.breed = "Chow Chow";
//		dog2.size = "Medium";
//		dog2.age = 3;
//		dog2.color = "Blanco";
//		dog2.eat();
//		dog2.run();
//		
//		System.out.println("El color de mi Dog 2 es: " + dog2.color);
		
		Modifier modifier = new Modifier();
		modifier.hello();

	}

}

package com.java;

public class Dog {
	
	// States = Variables de instancia
	String breed;
	String size;
	int age;
	String color;
	int patas;
	
	// Constructor
	public Dog(String breed, String size, int age, String color) {
		this.breed = breed;
		this.size = size;
		this.age = age;
		this.color = color;
		this.patas = 4;
	}
	
	// Constructor Overloaded
	public Dog(String breed, String size, int age, String color, int patas) {
		this.breed = breed;
		this.size = size;
		this.age = age;
		this.color = color;
		if(patas>10) {
			this.patas = -1;
		}else {
			this.patas = patas;
		}
		
	}
	
	public Dog() {
		
	}
	
	// Behavior
	public void eat() {
		System.out.println("El perro esta comiendo");
	}
	
	

	public void sleep() {
		System.out.println("El perro esta durmiendo");
	}
	
	public void sit() {
		System.out.println("El perro esta sentandose");
	}
	
	public void run() {
		System.out.println("El perro esta corriendo");
	}
}

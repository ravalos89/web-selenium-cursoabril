package com.java;

public class Methods {
	
//	Siempre pertenece a una clase, no se puede escribir fuera de una clase.
//	No podemos escribir métodos dentro de otros métodos.
//	Un método puede regresar cualquier tipo de dato (int, string, boolean, etc) y si el método no regresara nada se declara como void.
//	Dentro de un método se puede invocar otro método.

	public static void main(String[] args) {
		
//		System.out.println(suma(100,2));
//		sayHello();
//		decirHola();
		sayHelloDifferentLang("Ola");
		

	}
	
	public static void sayHello() {
		System.out.println("Hello");			
	}
	
	public static void decirHola() {
		System.out.println("Hola");
	}
	
	public static int suma(int x, int y) {
		int sum = x+y;
		return sum;
		
	}
	
	public static void sayHelloDifferentLang() {
		sayHello();
		decirHola();
	}
	
	// Overloading - Sobrecarga
	public static void sayHelloDifferentLang(String lang) {
		sayHello();
		decirHola();
		System.out.println(lang);
	}
	
	public void login(String user, String pwd) {
		String x = "";
	}
	
	public void login(String user, String pwd, String token) {
		login(user, pwd);
	}

}

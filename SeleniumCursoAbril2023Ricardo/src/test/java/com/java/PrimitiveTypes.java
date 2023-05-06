package com.java;

import org.apache.poi.util.SystemOutLogger;

public class PrimitiveTypes {
	
	// Variables de instancia
	int var3 =10;
	
	// Variables estaticas
	public static final int VAR = 1;

	public static void main(String[] args) {
		
		// VARIABLES LOCALES
		byte varByte = 127;
		
		int varInt = 5;
		
		// Declaracion, inicializacion, Utilizacion
		
		int var1;
		
		var1 = 10;
		
		System.out.println(var1);
		
		boolean var2 = true;
		
		System.out.println(var2);
		
		// Operadores
		
		// aritmeticos
		
		int var5 = 10;
		int var6 = 6;
		
		int resta = 10 - 6;
		
		int multiplicacion = var5 * var6;
		
		int division = var5 / var6;
		
		System.out.println("La resta es :" + resta);
		
		System.out.println("La multiplicacion es :" + multiplicacion);
		
		// Unarios
		
		int varUnario = 1;
		
		System.out.println("Valor Unarios " + (--varUnario));
		
		System.out.println(varUnario);
		
		// Relacionales
		
		int varRelacional1 = 5;
		int varRelacional2 = 5;
		
		if(varRelacional1 >= varRelacional2) {
			System.out.println("TRUE");
			
		}else {
			System.out.println("FALSE");
		}
		
		// Condicionales
		
		int varCond = 10;
		int varCond2 = 5;
		int varCond3 = 5;
		
		if(varCond != varCond2 && varCond2==varCond3 && varCond > varCond3) {
			System.out.println("CONDIONAL = TRUE");
			
		}else {
			System.out.println("CONDICIONAL= FALSE");
		}
		

	}

}

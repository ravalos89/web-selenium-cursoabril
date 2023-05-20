package com.java.ejercicios;

public class Mega {

	public static void main(String[] args) {
		
		mbAndKb(2049);

	}
	
	public static void mbAndKb(int kb) {
		if(kb<0) {
			System.out.println("Invalid value");
		}else {
			int conversionMBtoKB = kb / 1024;
			int residuo = kb % 1024;
			System.out.println("KB a convertir "+kb);
			System.out.println("MB totales "+ conversionMBtoKB);
			System.out.println("KB Residuo "+ residuo);
		}
	}

}

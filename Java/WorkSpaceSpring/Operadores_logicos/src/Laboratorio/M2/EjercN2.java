package Laboratorio.M2;

import java.util.Scanner;

public class EjercN2 {
	
	
	public static void main(String[] args) {
	System.out.println("+----------------------------------------+");
	 System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
	 System.out.println("|   Fecha:         31/oct 2020           |");
	 System.out.println("+----------------------------------------+");
	 System.out.println("|           OPERADORES LOGICOS           |");
	 System.out.println("+----------------------------------------+");
	 System.out.println();
	 
	 //Defino Variables
	 int a;
	 int b;
	 
	 boolean s;
	 boolean s1;
	 
	 a = 10;
	 b=18;
	 
	 s = a < b;
	 s1 = a <= b;
	 
	 try (Scanner scan = new Scanner(System.in)) {
		 
		System.out.println("el valor final de s: " +s);
		 
		 System.out.println("el valor final de S1:  " +s1);
		 
	}
	 
}
}

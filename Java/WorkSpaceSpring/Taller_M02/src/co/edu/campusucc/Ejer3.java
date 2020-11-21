package co.edu.campusucc;

import java.util.Scanner;

public class Ejer3 {
	

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
		try (Scanner scan = new Scanner(System.in)) {
			double calif1, calif2, calif3, calif11, calif12, calif13, calif21, calif22, calif23;
			
			System.out.println("+----------------------------------------+");
			System.out.println("Escribe el nombre del estudiante");
			scan.next();
	
			System.out.println("Ingresa la nota N°1");
			calif1 = scan.nextDouble();
			System.out.println("Ingresa la nota N°2");
			calif2 = scan.nextDouble();
			System.out.println("Ingresa la nota N°3");
			calif3 = scan.nextDouble();
			
			double nota_definitiva = calif1 * 0.3 + calif2 * 0.3 + calif3 * 0.4;
			
			System.out.println("La nota final es: "+nota_definitiva);
			
			System.out.println("+----------------------------------------+");
			
			System.out.println("Escribe el segundo nombre del estudiante");
			scan.next();
			
			System.out.println("Ingresa la nota N°1");
			calif11= scan.nextDouble();
			System.out.println("Ingresa la nota N°2");
			calif12= scan.nextDouble();
			System.out.println("Ingresa la nota N°3");
			calif13= scan.nextDouble();
			
			double nota_definitiva1 = calif11* 0.3 + calif12* 0.3 + calif13* 0.4;
			
			System.out.println("La nota final es: "+nota_definitiva1);
			
			System.out.println("+----------------------------------------+");
			
			System.out.println("Escribe el segundo nombre del estudiante");
			scan.next();
			
			System.out.println("Ingresa la nota N°1");
			calif21= scan.nextDouble();
			System.out.println("Ingresa la nota N°2");
			calif22= scan.nextDouble();
			System.out.println("Ingresa la nota N°3");
			calif23= scan.nextDouble();
			
			double nota_definitiva2= calif21* 0.3 + calif22* 0.3 + calif23* 0.4;
			
			System.out.println("La nota final es: "+nota_definitiva2);
			System.out.println("+----------------------------------------+");
	}

}

}

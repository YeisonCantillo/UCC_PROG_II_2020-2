package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaEvaluativo {
	public static void main(String[] args) {
		System.out.println("+-----------------------------------------+");
		 System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		 System.out.println("|   Fecha:         11/Nov 2020           |");
		 System.out.println("+----------------------------------------+");
		 System.out.println("|           PROGRAMACION JAVA            |");
		 System.out.println("+----------------------------------------+");
		 System.out.println();
		 
		int numero , expo;
		// A continuación se crea un programa no solo para calcular el cubo, sino *n* (enésima potencia)
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Ingrese el numero: ");
			numero = scan.nextInt();
			System.out.println("Ingrese el exponente: ");
			expo = scan.nextInt();
		}
		
		System.out.println("resultado:" +Math.pow(numero, expo));
	}

	}

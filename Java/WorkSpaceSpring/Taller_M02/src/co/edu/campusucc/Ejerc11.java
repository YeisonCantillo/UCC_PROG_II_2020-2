package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc11 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
		
			int numero;
			System.out.println("Ingrese un numero");
	        numero = scan.nextInt();
			
			if (numero < 0)
				System.out.println("El numero es: " + numero + "y su valor absoluto es: " + Math.abs(numero));
						
				else 
					System.out.println("EL numero es : " + numero);
			
			}
		}
}

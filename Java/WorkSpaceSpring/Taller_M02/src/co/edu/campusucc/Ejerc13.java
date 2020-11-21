package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc13 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
			
			int aceiteC;
			int aceiteH;
			
			System.out.println("Escriba cuantos litros de aceite crees que produjo Calvin");
			aceiteC = scan.nextInt();
			
			System.out.println("Escriba cuantos litros de aceite crees que produjo Hobbes");
			aceiteH = scan.nextInt();
			
			
			int total =(2 * aceiteH/3 + aceiteC);
			
			System.out.println("La producción de Calvin es de: " + total);
		}
		}
}

package co.edu.campusucc;

import java.util.Scanner;

public class AlgebrinyDividin {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
			
			int piezas = 12;
			int d�amuerto = 2;
			int metros;
			
			System.out.println("Digite cuantos metros cortar�a diario la se�ora diario");
			metros = scan.nextInt();
			
			int resultado = (piezas - d�amuerto) / metros;
			
			System.out.println("los d�as que se demora en cortar la pieza son: " +resultado);
		}
}
}
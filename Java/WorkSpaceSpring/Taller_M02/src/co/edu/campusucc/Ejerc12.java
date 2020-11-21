package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc12 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
			
			int sube;
			int baja;
			int total;
		
			System.out.println("Escribe el nombre del animal");
			scan.next();
			
			System.out.println("Digita cuantos metros sube");
			sube = scan.nextInt();
			
			System.out.println("Digita cuantos metros baja");
			baja = scan.nextInt();
			
			total = sube - baja;
			
			if (total > 1) {
				System.out.println("Este es el animal que llegará primero");
			}
			else if (total <=1) {
				System.out.println("Este animal no será el primero en llegar");
			}
		}
	}
}

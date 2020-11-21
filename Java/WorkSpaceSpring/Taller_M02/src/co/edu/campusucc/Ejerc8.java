package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc8 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
			
			int hora;
			int valor = 5000;
			int extra;
			int costo = 7500;
			
			int total;
			
			System.out.println("inserta el numero de horas laboradas");
			hora= scan.nextInt();
			
			System.out.println("Inserte el numero de horas extras laboradas");
			extra = scan.nextInt();
			
			
			total = hora * valor + extra * costo;
		
			System.out.println("El salario devengado para esta quincena es de: " +total);
			}
			}
}

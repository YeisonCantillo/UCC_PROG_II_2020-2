package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc6 {
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
			int valor;
			int sueldo;
			
			System.out.println("Cuantas horas laboro durante el mes");
			hora = scan.nextInt();
			
			System.out.println("Cual es el precio por hora trabajada");
			valor = scan.nextInt();
			
			sueldo = hora * valor;
			
			System.out.println("El salario del trabajador es: "+" "+sueldo);
			
			
		}
	}
}
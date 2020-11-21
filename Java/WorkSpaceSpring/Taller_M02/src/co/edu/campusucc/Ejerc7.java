package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc7 {

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
			
			int pag = 15;
			int min = 30;
			int treq; 
			int lop;
			int total;
			
			
			System.out.println("Digita el tiempo en minutos de lo que requieres");
			treq = scan.nextInt();
			
			
			total = treq * pag / min;
			
			System.out.println("El numero de páginas escritas según el tiempo es: " +total);
			System.out.println();
			
			System.out.println("+----------------------------------------+");
			
			System.out.println("Digita el otro tiempo en minutos de lo que requieres");
			lop = scan.nextInt();
			
			total = lop * pag / min;
			
			System.out.println("El numero de páginas escritas según el tiempo es: " +total);
		}
		
		
}
}

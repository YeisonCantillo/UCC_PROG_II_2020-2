package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc9 {

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
			
			float num1, num2, num3, num4, suma;
			
			System.out.println("Digite los cuatro numeros solicitados utilizando la barra espaciadora");
			num1 = scan.nextFloat();
			num2 = scan.nextFloat();
			num3 = scan.nextFloat();
			num4 = scan.nextFloat();
			
			suma = num1+num2+num3+num4;
			
			System.out.println("La suma de los cuatro nuemro es: "+suma);
		}
}
}
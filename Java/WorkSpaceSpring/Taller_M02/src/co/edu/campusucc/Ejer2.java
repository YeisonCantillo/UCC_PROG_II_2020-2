package co.edu.campusucc;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		
		float numero11, numero21 , numero31, numero41;
		float promedio;

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Ingrese el primer numero correspondiente a Calvin: ");
			numero11 = scan.nextInt();

			System.out.println("Ingrese el segundo numero correspondiente Calvin: ");
			numero21 = scan.nextInt();
			
			System.out.println("Ingrese el primer numero correspondiente a Hobbes: ");
			numero31 = scan.nextInt();

			System.out.println("Ingrese el segundo numero correspondiente a Hobbes: ");
			numero41 = scan.nextInt();

			int suma = (int) (numero11 + numero21);
			int resta = (int) (numero11 - numero21);
			int multiplicacion = (int) (numero11 * numero21);
			
			System.out.println("+------------------------------------------------------------+");
			
			System.out.println("El resultado de los dos numeros de Calvin son los siguientes: ");
			System.out.println();
			
			System.out.println("El resultado de la suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicacion es: " + multiplicacion);
			promedio = (numero11 + numero21 )/2; 
			System.out.println("El promedio es: " + promedio + ",");
			
			System.out.println("+------------------------------------------------------------+");
			
			System.out.println("El resultado de los dos numeros de Hobbes son los siguientes: ");
			System.out.println();

				int suma1 = (int) (numero31 + numero41);
				int resta1 = (int) (numero31 - numero41);
				int multiplicacion1 = (int) (numero31 * numero41);
				promedio = (numero31 + numero41 )/2;
				
				System.out.println("El resultado de la suma es: " + suma1 + "\nLa resta es: " + resta1 + "\nLa multiplicacion es: " + multiplicacion1);
				promedio = (numero31 + numero41 )/2; 
				System.out.println("El promedio es: " + promedio + ",");
			System.out.println("+------------------------------------------------------------+");
			
	            	
	            }
	        }
		}
	        
	        
	

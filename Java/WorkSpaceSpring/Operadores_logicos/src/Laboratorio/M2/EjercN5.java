package Laboratorio.M2;

import java.util.Scanner;

public class EjercN5 {

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		 System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		 System.out.println("|   Fecha:         31/oct 2020           |");
		 System.out.println("+----------------------------------------+");
		 System.out.println("|           OPERADORES LOGICOS           |");
		 System.out.println("+----------------------------------------+");
		 System.out.println();
		 
		 
		 int i2 = 4;
		 int i1 = 5;
		 boolean k = i1 != i2;
		 
		 try (Scanner scan = new Scanner (System.in)) {
			System.out.println("¿La tierra es un Satélite? [0]...Falso [1]...Verdadero");
			 i1 = scan.nextInt();
			 
			 
					System.out.println("¿Azul es una obra literaría de Ruben Darío? [0]...Falso [1]...Verdadero");
					 i2 = scan.nextInt();
					 
					 
					 System.out.printf("Escriba el valor de variable k: " , k);
			
		}
		 
		 
		 if (i1 ==0 & i2 >0 ) {
			 System.out.println("Verdadero");
			 
		 }
		 else {
			 System.out.println("Falso");
			 
			
		 
	}
	 	 }	  
	 	 	 }

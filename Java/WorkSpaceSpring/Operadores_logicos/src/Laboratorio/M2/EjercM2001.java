package Laboratorio.M2;

import java.util.Scanner;

public class EjercM2001 {
	
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		 System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		 System.out.println("|   Fecha:         31/oct 2020           |");
		 System.out.println("+----------------------------------------+");
		 System.out.println("|        PROGRAMA Entrada Manual         |");
		 System.out.println("+----------------------------------------+");
		 System.out.println();
		 
		 
		 int i2 ;
		 int i1;
		 int k;
		 
		 try (Scanner scan = new Scanner (System.in)) {
			System.out.println("¿La tierra es redonda? [0]...Falso [1]...Verdadero");
			 i1 = scan.nextInt();
			 
			 
					System.out.println("¿25 es un cuadrado perfecto? [0]...Falso [1]...Verdadero");
					 i2 = scan.nextInt();
					 
					 
					 System.out.println("Escriba el valor de variable k");
					 k = scan.nextInt();
		}
		 
		 
		 if ((i1 & i2) ==1 ) {
			 System.out.println("Verdadero");
			 
		 }
		 else {
			 System.out.println("Falso");
			 
			
		 
	}
	 	 }	  
	 	 	 }

 	  
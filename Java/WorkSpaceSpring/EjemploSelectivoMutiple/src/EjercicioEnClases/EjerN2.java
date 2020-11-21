package EjercicioEnClases;

import java.util.Scanner;

public class EjerN2 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		

		try (Scanner scan = new Scanner(System.in)) {
			
			
			
			String nombre ="";
			int semestre;
			char plan;
			float valor = 0;
			System.out.println("Escriba su nombre");
			nombre = scan.next();
			
			System.out.println("Ingresa el plan '1 para economía, '2' administración y '3' ciencias");
			plan = (char) scan.nextInt();
			
			System.out.println("Ingresa el semestre en el que te encuentras: ");
			semestre = scan.nextInt();
			
			if (semestre <= 3) {
			 if (plan == 1) {
				
			valor =1500;
					
			System.out.println("El valor a pagar por el carnet es: " +valor);
			
			}if (plan ==2) {
			valor = 2000;
			System.out.println("El valor a pagar por el carnet es: " +valor);
			
				
			}if (plan ==3) {
			valor = 1800;
			System.out.println("El valor a pagar por el carnet es: " +valor);
			
			
			
			}else
				System.out.println("");
			}else if (semestre ==(4&5&6&7)) {
				 if (plan == 1) {
					
				valor =2220;
						
				System.out.println("El valor a pagar por el carnet es: " +valor);
				
				}if (plan ==2) {
				valor = 4000;
				System.out.println("El valor a pagar por el carnet es: " +valor);
				
					
				}if (plan ==3) {
				valor = 5000;
				System.out.println("El valor a pagar por el carnet es: " +valor);
				
				}else
					System.out.println("Error");
				
			}else if (semestre > 8) {
				 if (plan == 1) {
					
				valor =3000;
						
				System.out.println("El valor a pagar por el carnet es: " +valor);
				
				}if (plan ==2) {
				valor = 6000;
				System.out.println("El valor a pagar por el carnet es: " +valor);
				
					
				}if (plan ==3) {
				valor = 7000;
				System.out.println("El valor a pagar por el carnet es: " +valor);
				
	}
			System.out.println();
			System.out.println();
			System.out.println("El estudiante: " +nombre);
			System.out.println("Cancela el carnet con un costo de: " +valor);
			
		
			}
		}
	
			}
	}
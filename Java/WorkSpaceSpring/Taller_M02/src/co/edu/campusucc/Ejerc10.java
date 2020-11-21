package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc10 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
			
			int horasTrabajadas;
			int valorhora = 5000;
			int HoraExt = 6000;
			int horaOrdinaria =48;
			
			System.out.println("+----------------------------------------+");
			System.out.println("Digite el nombre");
			scan.next();
			System.out.println("+----------------------------------------+");
		    System.out.println("Digite su código ID");
			scan.nextInt();
			System.out.println("+----------------------------------------+");
			
			System.out.println("Digite cuantas horas trabajó");
			horasTrabajadas = scan.nextInt();
			System.out.println("+----------------------------------------+");
			
			int total =( horasTrabajadas - horaOrdinaria) * HoraExt;
			
			if (total >= 1) {
				System.out.println("Este corresponde a tus horas extras: "+total);
				
			}
			else if (total <1) {
				System.out.println("No tines horas extras");
				System.out.println();
			}
			System.out.println("+----------------------------------------+");
			
			int totalApagar = (horaOrdinaria * valorhora) + total;
			System.out.println();
			
			System.out.println("Tu pago es equivalente en COP" +totalApagar);
			System.out.println("+----------------------------------------+");
		}
		}
}
package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc14 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {
			
			int ni�aida;
			int ni�areg = 12;
			int pintaida;
			int pintareg = 11;
			int Santmida;
			int Santmreg = 8;
			int millasTotal = 1200;
			
			System.out.println(      "Digite las millas por horas de ida de la NI�A");
			ni�aida = scan.nextInt();
			System.out.println(     "Digite las millas por horas de ida de la PINTA");
			pintaida = scan.nextInt();
			System.out.println("Digite las millas por horas de ida de la SANTAMAR�A");
			Santmida = scan.nextInt();
			
			int HoraR = millasTotal / ni�aida + millasTotal / ni�areg;
			System.out.println("Las horas recorridas de la NI�A fueron : " + HoraR);
			
			int HoraR1 = millasTotal / pintaida + millasTotal / pintareg;
			System.out.println("Las horas recorridas de la PINTA fueron : " + HoraR1);
			
			int HoraR2 = millasTotal / Santmida + millasTotal / Santmreg;
			System.out.println("Las horas recorridas de la SANTAMAR�A fueron : " + HoraR2);
			
			System.out.println();
			
			if (HoraR !=  HoraR1 ) {
				System.out.println("Por lo tanto las embarcaciones no llegan juntas");
			}
			else if (HoraR == HoraR1) {
				System.out.println("Todas llegan juntas");
			
			
			
			}
		}
		}
}

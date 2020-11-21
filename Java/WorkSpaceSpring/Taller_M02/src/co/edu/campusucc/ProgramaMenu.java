package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaMenu {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         21/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|             PROGRAMA Menú              |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		System.out.println("Digite 1 para el porgrama Ejer2");
		System.out.println("Digite 2 para el porgrama BBB");
		System.out.println("Digite 3 para el porgrama CCC");
		try (Scanner scan = new Scanner(System.in)) {
			int opcionPrograma;
			String comando = "";
			
			System.out.println("Digite el numero del programa para ejecutarlo");
			opcionPrograma = scan.nextInt();

			switch (opcionPrograma) {
			case 1:
				comando = "java Ejer2";
				break;

			default:
				break;
			}

			try {
				Runtime.getRuntime().exec(comando);
			} catch (Exception e) {
				System.out.println("Error en el método exec ()");
			}

		}
	}
}
package EjercicioEnClases;

import java.util.Scanner;

public class EercN6 {
	private static char dod;

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {

			String Tcarro;
			char Maz = 5000;
			char Ren = 3000;
			char Che = 2500;
			char Fiat = 2000;
			char dodg = 2200;
			char otros = 1700;
			String Tdiag;
			char CambioDeAceite = 0;
			int totalapagar;
			int valor;
			double Adicional;

			System.out.println("Escriba la marca de su carro");
			Tcarro = scan.next();

			if (Maz == 0)
				;
			valor = 5000;
			System.out.println("El valor a cobrar es: " + valor);

			

			System.out.println("Tipo de diagostico adicional a realizar:" +CambioDeAceite);
			Tdiag = scan.next();
			

			System.out.println("Inserte el valor del diagnostico adicional");
			Adicional = scan.nextInt();

			System.out.println("El servivicio adquirido fue:" + Tcarro);
			System.out.println("");
			System.out.println("El servivicio adicional fue:" + Tdiag);
			totalapagar = (int) (valor + Adicional);
			System.out.println("El Total a pagar es: "+totalapagar);
		}
	}
}

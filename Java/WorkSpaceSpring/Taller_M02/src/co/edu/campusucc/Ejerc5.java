package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc5 {

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();


		int pre, pag, cambio, faltante;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Ingrese el precio del artículo");
			pre = (int) scan.nextFloat();
			System.out.println("¿cuánto ha pagado el cliente?");
			pag = (int) scan.nextFloat();
		}

		cambio = pag - pre;
		faltante = pre - pag;

		if (cambio < 0) {
			System.out.println("Falta dinero en el pago. El dinero faltante es " +faltante);	
		}
		else if (cambio > 0) {
			System.out.println("El cambio a dar es " + cambio);
		}
 
	}

}

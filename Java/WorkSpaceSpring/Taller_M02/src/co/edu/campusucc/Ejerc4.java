package co.edu.campusucc;

import java.util.Scanner;

public class Ejerc4 {

	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
		try (Scanner scan = new Scanner(System.in)) {
		
		double compra;
		
		System.out.println("+----------------------------------------+");
		
		System.out.println("Escribe el nombre del trabajador");
		scan.next();
		
		System.out.println("Ingrese su salario devengado");
		compra = scan.nextDouble();
		
		if (compra >= 100000 && compra <=250000) {
			compra -= (compra * 0.2);
		}
		else if (compra >=400000) {
			compra -= (compra*0.15);
		}
		System.out.println("El monto a pagar después de haber aplicado el desceunto es: "+compra);
	}
}
}
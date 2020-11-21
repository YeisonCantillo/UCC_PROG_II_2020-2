package EjercicioEnClases;

import java.util.Scanner;

public class EjerN1 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         31/oct 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           OPERADORES LOGICOS           |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {

			int cate;
			double sueldo = 0;
			String nombre = "";

			System.out.println("Escribe el nombre");
			nombre = scan.next();

			System.out.println("Escribe la categoría");
			cate = scan.nextInt();
			scan.reset();
			System.out.println("Escribe tu sueldo");
			sueldo = scan.nextDouble();

			switch (cate) {

			case 1:
				sueldo = (int) (sueldo * 1.15);
				break;
			case 2:
				sueldo = (int) (sueldo * 1.10);
				break;
			case 3:
				sueldo = (int) (sueldo * 1.08);
				break;
			case 4:
				sueldo = (int) (sueldo * 1.07);
				break;

			default:
				sueldo = 0;
				System.out.println("Error");
				

			}
			System.out.println("El empleado: " + nombre);
			System.out.println("Tu sueldo es de: " + sueldo);
		}
	}
}
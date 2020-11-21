package EjercicioEnClases;

import java.util.Scanner;


public class EjerN4 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();

		try (Scanner scan = new Scanner(System.in)) {

			String producto;
			int a = 0, b = 0, c = 0;
			int totalapagar = 0;
			double unidades;
			int valor = 0;

			System.out.println("Escriba el nombre del producto");
			producto = scan.next();

			System.out.println("Digite cuantas unidades va a llevar");
			unidades = scan.nextDouble();

			if (a < 501) {
				valor = (int) ((int) (500 * unidades) * 0.07);
				totalapagar = (int) (500 * unidades + valor);
				System.out.println("El costo del producto a es: " + totalapagar);

				if (a > 500) {
					valor = (int) ((int) (1000 * unidades) * 0.09);
					totalapagar = (int) (1000 * unidades + valor);
					System.out.println("El costo del producto *a* es: " + valor);

				} else
					System.out.println("El total del iva del producto *a* corresponde a: " + valor);

			} if (b < 501) {
				valor = (int) ((int) (800 * unidades) * 0.08);
				totalapagar = (int) (800 * unidades + valor);
				System.out.println("El costo del producto *b* es: " + totalapagar);

			} if (b > 500) {
				valor = (int) ((int) (1400 * unidades) * 0.11);
				totalapagar = (int) (1400 * unidades + valor);
				System.out.println("El costo del producto *b* es: " + totalapagar);

			} else
				System.out.println("El total del iva del producto *b* corresponde a: " + valor);

			if (c < 501) {
				valor = (int) ((int) (1000 * unidades) * 0.05);
				totalapagar = (int) (1000 * unidades + valor);
				System.out.println("El costo del producto *c* es: " + totalapagar);

			} else if (c > 500) {
				valor = (int) ((int) (1600 * unidades) * 0.10);
				totalapagar = (int) (1600 * unidades + valor);
				System.out.println("El costo del producto *c* es: " + totalapagar);

			}else
				System.out.println("El total del iva del producto *c* corresponde a: " + valor);
	

			System.out.println();
			System.out.println("Señor usuario este es su producto : " + producto);
			System.out.println("El costo de su factura es de un total de: " + totalapagar);
		}
	}
}

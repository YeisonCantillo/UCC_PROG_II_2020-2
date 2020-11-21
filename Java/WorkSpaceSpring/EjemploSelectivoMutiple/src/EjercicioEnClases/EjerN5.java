package EjercicioEnClases;

import java.util.Scanner;

public class EjerN5 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		
		try (Scanner scan = new Scanner(System.in)) {

		
		
		int corriente = 200, ejecutivo =300;
		int servicio;
		int ruta;
		int utilidad;
		int pasajes;
		int total;
		int apagar;
		int mantenimiento;
		System.out.println("Escribe la ruta a coger");
		ruta = scan.nextInt();
		
		System.out.println("Escribe los pasajes vendidos");
		pasajes = scan.nextInt();
		
		System.out.println("Escribe el costo del pasaje segun el tipo de servicio");
		servicio = scan.nextInt();
		System.out.println();
		System.out.println("Las gananacias a continuación las refleja la RUTA N° : " +ruta);
		total = (int) (pasajes * servicio);
		apagar = (int) (total*0.30);
		System.out.println("El total a pagar al conductor es: " +apagar);
		mantenimiento = (int) (total * 0.10);
		System.out.println("El gasto en mantenimeinto es: " +mantenimiento);
		utilidad = total - apagar - mantenimiento;
		System.out.println("Y la utilidad es: " +utilidad);
		
	
	
		}
	}
}


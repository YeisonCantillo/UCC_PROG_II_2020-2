package EjercicioEnClases;

import java.util.Scanner;

public class EjerN3 {
	public static void main(String[] args) {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         11/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|           PROGRAMACION JAVA            |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		

		try (Scanner scan = new Scanner(System.in)) {
			
			String nombre = "";
			char ubicacion = 0;
			char peq = 0, med = 1, gran = 2;
			int tamaño;
			float valor = 0;
			
			System.out.println("Escriba su nombre");
			nombre = scan.next();
			
			System.out.println("Escriba su ubicación 1 para NORTE, 2 para SUR, 3 para Oriente y 4 para OCCIDENTE");
			ubicacion = (char) scan.nextInt();
			
			System.out.println("Tamaño de su telefono 0 PEQUEÑO, 01 MEDIANO y 02 GRANDE");
			tamaño = scan.nextInt();
			
			if (ubicacion == 1 ) {
				if (tamaño == peq) {
				valor = 500;
				System.out.println("El costo por minuto para usted será de: " +valor);
				
				
				}if (tamaño == med) {
						valor = 250;
						System.out.println("El costo por minuto para usted será de: " +valor);
						
				}if (tamaño == gran) {
					valor = 100;
					System.out.println("El costo por minuto para usted será de: " +valor);
						
				}else
					System.out.println("");
				
				} else if (ubicacion == 2 ) {
					if (tamaño == peq) {
					valor = 400;
					System.out.println("El costo por minuto para usted será de: " +valor);
					
					}if (tamaño == med) {
						valor = 200;
						System.out.println("El costo por minuto para usted será de: " +valor);
					
					}else
						System.out.println("Error");
					
				}else if (ubicacion == 3 ) {
							if (tamaño == gran) {
							valor = 100;
							System.out.println("El costo por minuto para usted será de: " +valor);
							
							}else
								System.out.println("No existe cobertura para este tamaño");
							
				}else if (ubicacion == 4 ) {
								if (tamaño == peq) {
								valor = 300;
								
								System.out.println("El costo por minuto para usted será de: " +valor);
								
								}else if (tamaño == gran) {
									valor = 200;
									
									System.out.println("El costo por minuto para usted será de: " +valor);
								
	}
		System.out.println ();
		System.out.println("Señor : " +nombre);
		System.out.println("El costo por minuto según su ubucación y tamaño de su telefono su costo será de: " +valor);
							}
						}
					}
			}
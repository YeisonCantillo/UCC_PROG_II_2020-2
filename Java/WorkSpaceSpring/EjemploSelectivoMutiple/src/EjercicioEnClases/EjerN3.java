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
			int tama�o;
			float valor = 0;
			
			System.out.println("Escriba su nombre");
			nombre = scan.next();
			
			System.out.println("Escriba su ubicaci�n 1 para NORTE, 2 para SUR, 3 para Oriente y 4 para OCCIDENTE");
			ubicacion = (char) scan.nextInt();
			
			System.out.println("Tama�o de su telefono 0 PEQUE�O, 01 MEDIANO y 02 GRANDE");
			tama�o = scan.nextInt();
			
			if (ubicacion == 1 ) {
				if (tama�o == peq) {
				valor = 500;
				System.out.println("El costo por minuto para usted ser� de: " +valor);
				
				
				}if (tama�o == med) {
						valor = 250;
						System.out.println("El costo por minuto para usted ser� de: " +valor);
						
				}if (tama�o == gran) {
					valor = 100;
					System.out.println("El costo por minuto para usted ser� de: " +valor);
						
				}else
					System.out.println("");
				
				} else if (ubicacion == 2 ) {
					if (tama�o == peq) {
					valor = 400;
					System.out.println("El costo por minuto para usted ser� de: " +valor);
					
					}if (tama�o == med) {
						valor = 200;
						System.out.println("El costo por minuto para usted ser� de: " +valor);
					
					}else
						System.out.println("Error");
					
				}else if (ubicacion == 3 ) {
							if (tama�o == gran) {
							valor = 100;
							System.out.println("El costo por minuto para usted ser� de: " +valor);
							
							}else
								System.out.println("No existe cobertura para este tama�o");
							
				}else if (ubicacion == 4 ) {
								if (tama�o == peq) {
								valor = 300;
								
								System.out.println("El costo por minuto para usted ser� de: " +valor);
								
								}else if (tama�o == gran) {
									valor = 200;
									
									System.out.println("El costo por minuto para usted ser� de: " +valor);
								
	}
		System.out.println ();
		System.out.println("Se�or : " +nombre);
		System.out.println("El costo por minuto seg�n su ubucaci�n y tama�o de su telefono su costo ser� de: " +valor);
							}
						}
					}
			}
package co.edu.campusucc;

import java.util.Scanner;

public class EjerN6 {
public static void main(String[] args) {
		
		System.out.println("*                                                  *");
		System.out.println("**                                                **");
		System.out.println("***                                              ***");
		System.out.println("****                                            ****");
		System.out.println("*****                                          *****");
		System.out.println("*****                                         ******");
		System.out.println("******* ING YEISON DAVID CANTILLO MONSALVO   *******");
		System.out.println("******** _________________________________  ********");
		System.out.println("*******        Herr. Computacionales         *******");
		System.out.println("******                                        ******");
		System.out.println("*****                                          *****");
		System.out.println("****                                            ****");
		System.out.println("***                                              ***");
		System.out.println("**                                                **");
		System.out.println("*                                                  *");

		try (Scanner scan = new Scanner(System.in)) {
			
			int a = 0, i, numero;
			System.out.println("Ingresa un numero");
			numero = scan.nextInt();
			
			for (i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					
					a++;
				}
			}
			if (a !=2) {
				System.out.println("No es un Numero Primo");
			} else {
				System.out.println("Si es un numero primo");
			}
			}
		}
}

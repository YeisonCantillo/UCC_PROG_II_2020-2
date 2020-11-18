package co.edu.campusucc;

import java.util.Scanner;

public class EjerN5 {
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
			
			int n1, n2, n3;
			
			System.out.println("Ingresa el primer numero digito");
			n1 = scan.nextInt();
			
			System.out.println("Ingresa el segundo digito");
			n2 = scan.nextInt();
			
			System.out.println("Ingresa el tercer digito");
			n3 = scan.nextInt();
			
				
			 if (n1 > n2 && n1 > n3) {
				System.out.println("El numero mayor es: " +n2);
			}else {
				System.out.println("El numero mayor es: " +n1);
			}
			}
		}
}

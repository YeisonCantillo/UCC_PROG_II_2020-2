package co.edu.campusucc;

import java.util.Scanner;

public class EjerN4 {
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
			
			int n1, n2, n3, digito;
			System.out.println("Ingresa el 1er numero");
			n1 = scan.nextInt();
			
			System.out.println("Ingresa el 2do numero");
			n2 = scan.nextInt();
			
			System.out.println("Ingresa el 3er numero");
			n3 = scan.nextInt();
			
			System.out.println("Ingresa un digito");
			digito = scan.nextInt();
			
			if (digito == n1) {
				System.out.println("Está");
			}else if (digito == n2){
				System.out.println("Está");
			}else if (digito == n3)
				System.out.println("Está");
					
		else {
				System.out.println("No está");
			}
		}
}
}
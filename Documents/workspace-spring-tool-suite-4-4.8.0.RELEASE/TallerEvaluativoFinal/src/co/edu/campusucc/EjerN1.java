package co.edu.campusucc;

import java.util.Scanner;

public class EjerN1 {

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
			
			int num;
			System.out.println("Ingresa el numero");
			num = scan.nextInt();
			
			do {
				System.out.print("|" +num%10+ "|");
				num/=10;
			}while (num!=0);
			
			}
		}
}
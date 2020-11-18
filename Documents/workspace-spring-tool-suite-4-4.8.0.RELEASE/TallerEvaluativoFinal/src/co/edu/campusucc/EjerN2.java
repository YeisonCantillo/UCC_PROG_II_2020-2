package co.edu.campusucc;

import java.util.Scanner;

public class EjerN2 {
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
			
			int numero, sumDig =0;
			System.out.println("Ingresa los numeros");
			numero = scan.nextInt();
			
			int aux = numero;
			
			while (numero !=0) {
				
				sumDig = sumDig + (numero % 10);
				numero = numero / 10;
			}
			System.out.println("La suma de los digitos de  " + aux+  "  es  " +sumDig);
		}
}
}
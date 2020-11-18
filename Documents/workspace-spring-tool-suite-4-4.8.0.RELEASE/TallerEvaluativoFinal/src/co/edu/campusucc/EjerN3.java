package co.edu.campusucc;

import java.util.Scanner;

public class EjerN3 {
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
			
			int numero;
			int residuo;
			int invertir = 0;
			int aux;
			
			System.out.println("Ingrese un numero");
			numero = scan.nextInt();
			aux = numero;
			
			while (numero!=0) {
				residuo = numero%10;
				invertir = invertir*10+residuo;
				numero = numero/10;
			
		}
			System.out.println(invertir);
			if (aux == invertir) {
				System.out.println("Es Capicúa");
			}
			
			else
				System.out.println("No es Capicúa");
}
		}
}

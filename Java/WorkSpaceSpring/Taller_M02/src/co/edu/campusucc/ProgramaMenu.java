package co.edu.campusucc;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProgramaMennu {

	public static void main(String[] args) throws Exception {
		System.out.println("+----------------------------------------+");
		System.out.println("|   Autor:    Yeison Cantillo Monsalvo   |");
		System.out.println("|   Fecha:         21/Nov 2020           |");
		System.out.println("+----------------------------------------+");
		System.out.println("|             PROGRAMA Menú              |");
		System.out.println("+----------------------------------------+");
		System.out.println();
		int numero;
		

		try (Scanner scan = new Scanner(System.in)) {
			
			String varib = null;

			System.out.println("Digite 1 para el  porgrama Ejer2             ");
			System.out.println("Digite 2 para el  porgrama Ejer3             ");
			System.out.println("Digite 3 para el  porgrama Ejerc4            ");
			System.out.println("Digite 4 para el  porgrama Ejer5             ");
			System.out.println("Digite 5 para el  porgrama Ejer6             ");
			System.out.println("Digite 6 para el  porgrama Ejerc7            ");
			System.out.println("Digite 7 para el  porgrama Ejer8             ");
			System.out.println("Digite 8 para el  porgrama Ejer9             ");
			System.out.println("Digite 9 para el  porgrama ProgramaEvaluativo");
			System.out.println("Digite 10 para el porgrama AlgebrinyDividin  ");
			System.out.println("Digite 11 para el porgrama EjerN1            ");
			System.out.println("Digite 12 para el porgrama EjerN2            ");
			System.out.println("Digite 13 para el porgrama NumPrimos         ");
			System.out.println("Digite 14 para el porgrama Ejerc10           ");
			System.out.println("Digite 15 para el porgrama Ejerc11           ");
			System.out.println();

			System.out.println("Digite el programa a ejecutar");
			numero = scan.nextInt();
			System.out.println();

			System.out.println("El numero digitado es: " + numero);
			
			if (numero == 1){
				varib = "Ejer2";
			}
			if (numero == 2){
				varib = "Ejer3";
			}
			if (numero == 3){
				varib = "Ejerc4";
			}
			if (numero == 4){
				varib = "Ejerc5";
			}
			if (numero == 5 ){
				varib = "Ejerc6";
			}
			if (numero == 6){
				varib = "Ejerc7";
			}
			if (numero == 7 ){
				varib = "Ejerc8";
			}
			if (numero == 8){
				varib = "Ejerc9";
			}
			if (numero == 9 ){
				varib = "ProgramaEvaluativo";
			}
			if (numero == 10){
				varib = "AlgebrinyDividin";
			}
			if (numero == 11){
				varib = "EjerN1";
			}
			if (numero == 12){
				varib = "EjerN2";
			}
			if (numero == 13){
				varib = "NumPrimos";
			}
			if (numero == 14){
				varib = "Ejerc10";
			}
			if (numero == 15){
				varib = "Ejerc11";
			}

			Path currentRelativePath = Paths.get("");
            String ss = currentRelativePath.toAbsolutePath().toString();
            System.out.println("La ruta desde donde ejecutas tu comando es: " + ss);
            ProcessBuilder builder = new ProcessBuilder("java", "C:\\UCC_PROG_II_2020-2\\Java\\SPRING\\Taller_M02\\src\\co\\edu\\campusucc\\"+varib+".java");
            builder.redirectErrorStream(true);
            builder.inheritIO();
            Process process = builder.start();
            int errCode = process.waitFor();
            System.out.println("Error al ejecutar el comando? " + (errCode == 0 ? "No" : "Sí"));
            
 
    				
	            }
	}
}

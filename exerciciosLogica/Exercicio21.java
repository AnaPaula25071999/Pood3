package exerciciosLogica;

import java.util.Scanner;


public class Exercicio21 {

	public void run() {
		/*21. Fa�a um algoritmo que, lendo 3 n�meros correspondentes aos coeficientes a, b, e c de uma equa��o do 2� grau, calcule
seu DELTA e tamb�m as ra�zes desta equa��o, imprimindo seus valores. */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o coeficiente \"a\" da equa�ao de 2� grau:");
		float a = input.nextFloat();
		System.out.print("Digite o coeficiente \"b\" da equa�ao de 2� grau:");
		float b = input.nextFloat();
		System.out.print("Digite o coeficiente \"c\" da equa�ao de 2� grau:");
		float c = input.nextFloat();
		double raiz1, raiz2, delta;
		if(a!= 0) {
			delta = ((b*b)-(4*a*c));
			System.out.println("O delta � igual a "+ delta +".");
			if(delta>=0) {
				raiz1 = (-b + Math.sqrt(delta))/(2*a) ;
				raiz2 = (-b - Math.sqrt(delta))/(2*a) ;
				System.out.println("A primeira raiz � igual a "+ raiz1 +".");
				System.out.println("A segunda raiz � igual a "+ raiz2 +".");
			}else {
				System.out.println("O delta � menor que zero portanto n�o existe raizes reais.");
			}
			
			
		}else {
			System.out.println("O coeficiente \"a\" � igual a 0 portanto n�o � uma equa�ao de 2� grau;");
		}
	
	}
}

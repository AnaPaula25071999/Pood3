package exerciciosLogica;

import java.util.Scanner;


public class Exercicio21 {

	public void run() {
		/*21. Faça um algoritmo que, lendo 3 números correspondentes aos coeficientes a, b, e c de uma equação do 2º grau, calcule
seu DELTA e também as raízes desta equação, imprimindo seus valores. */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o coeficiente \"a\" da equaçao de 2° grau:");
		float a = input.nextFloat();
		System.out.print("Digite o coeficiente \"b\" da equaçao de 2° grau:");
		float b = input.nextFloat();
		System.out.print("Digite o coeficiente \"c\" da equaçao de 2° grau:");
		float c = input.nextFloat();
		double raiz1, raiz2, delta;
		if(a!= 0) {
			delta = ((b*b)-(4*a*c));
			System.out.println("O delta é igual a "+ delta +".");
			if(delta>=0) {
				raiz1 = (-b + Math.sqrt(delta))/(2*a) ;
				raiz2 = (-b - Math.sqrt(delta))/(2*a) ;
				System.out.println("A primeira raiz é igual a "+ raiz1 +".");
				System.out.println("A segunda raiz é igual a "+ raiz2 +".");
			}else {
				System.out.println("O delta é menor que zero portanto não existe raizes reais.");
			}
			
			
		}else {
			System.out.println("O coeficiente \"a\" é igual a 0 portanto não é uma equaçao de 2° grau;");
		}
	
	}
}

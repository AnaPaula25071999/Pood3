package exerciciosLogica;

import java.util.Scanner;


public class Exercicio12 {

	public void run() {
		/* 12. Escreva um programa capaz de calcular o pre�o total a ser pago por uma compra de copos pl�sticos. O usu�rio deve
fornecer o n�mero de copos a serem comprados e o programa deve calcular o pre�o total a ser cobrado, exibindo-o.
Observe que: se o n�mero de copo � inferior ou igual a 100, o pre�o por copo � R$0.05; se o n�mero de copos est� entre
101 e 500, o pre�o por copo � R$0.04; finalmente se o n�mero de copos � superior a 500 o pre�o por copo � R$0.035. */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual o n�mero de copos a serem comprados? ");
		int num = input.nextInt();
		double precos = 0;

		
		if ( num <= 100) { 
			precos = num * 0.05;
		} else {
			if ( (num >= 101)&&(num <= 500)) { 
				precos = num * 0.04;
			} else {
				if ( num >= 500) { 
					precos = num * 0.035;
			
				}	
			}
		}
		System.out.print("O pre�o total a ser cobrado � de " + precos +" reais.");
			
	}

}

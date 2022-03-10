package exerciciosLogica;

import java.util.Scanner;


public class Exercicio25 {

	public void run() {
		/*25. Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de números a serem somados:");
		int n = input.nextInt();
		
		int i, soma = 0, num;

		for(i = 0;i < n;i++) {
			System.out.print("Digite um número a ser somado:");
			num = input.nextInt();
			soma += num;
			
			System.out.println("SOMA:" + soma);
		}
		System.out.println("\n A soma final é igual a: " + soma);
		
	

		
	}
}
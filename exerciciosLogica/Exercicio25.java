package exerciciosLogica;

import java.util.Scanner;


public class Exercicio25 {

	public void run() {
		/*25. Fa�a um programa que calcule a soma de N n�meros quaisquer fornecidos pelo usu�rio. */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de n�meros a serem somados:");
		int n = input.nextInt();
		
		int i, soma = 0, num;

		for(i = 0;i < n;i++) {
			System.out.print("Digite um n�mero a ser somado:");
			num = input.nextInt();
			soma += num;
			
			System.out.println("SOMA:" + soma);
		}
		System.out.println("\n A soma final � igual a: " + soma);
		
	

		
	}
}
package exerciciosLogica;

import java.util.Scanner;


public class Exercicio26{

	public void run() {
		/*26. Escreva um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. 
		 * O programa deve parar de ler e, portanto somar os valores quando for introduzido o número 0 (zero).  */
		
		Scanner input = new Scanner(System.in);

		int i = 1, soma = 0, num = 1;

		while(num != 0) {
			System.out.print("O "+i+"° número a ser somado:");
			num = input.nextInt();
			soma += num;
			i++;
			System.out.println("SOMA:" + soma);
		}
		System.out.println("\n A soma final é igual a: " + soma);
		
		
	}
}
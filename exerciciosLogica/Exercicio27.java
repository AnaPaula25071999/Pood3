package exerciciosLogica;

import java.util.Scanner;


public class Exercicio27{

	public void run() {
		/*27. Calcule a média de Notas de alunos. O programa deve parar de ler valores quando for fornecido um valor negativo como
nota. */
		
		Scanner input = new Scanner(System.in);

		int i = 0, media, soma = 0, nota = 1;

		while(nota>=0) {
			i++;
			System.out.print("Insira a "+i+"° nota:");
			nota = input.nextInt();
			if(nota>=0) {
				soma += nota;
			}else {
				i--;
			}
		}
		media =  soma/i;
		System.out.println("\n A média de Notas de alunos é igual a: " + media);
		
		
	}
}
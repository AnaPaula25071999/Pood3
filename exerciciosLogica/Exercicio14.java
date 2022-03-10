package exerciciosLogica;

import java.util.Scanner;

import javax.print.attribute.standard.Media;


public class Exercicio14 {

	public void run() {
		/* 14. Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética. Imprima também
"Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame" se estiver entre 3 e 7. */
		Scanner input = new Scanner(System.in);
		float media;
		
		System.out.print("Nota 1: ");
		float nota1 = input.nextFloat();
		System.out.print("Nota 2: ");
		float nota2 = input.nextFloat();
		System.out.print("Nota 3: ");
		float nota3 = input.nextFloat();

		media = (nota1 + nota2 + nota3)/3;
		System.out.print("A sua média é de "+ media +". ");
		
		if ( media >= 7) { 
			System.out.print("Aprovado.");
		} 
		if ( (media < 7) && (media >= 3)){
			System.out.print("Exame.");
		}
		if ( media < 3){
			System.out.print("Reprovado.");
		}
	}

}
package exerciciosLogica;
/*
1.  Escreva um programa que leia um n�mero inteiro fornecido pelo usu�rio, 
	armazenando-o numa vari�vel apropriada.
    Imprima o valor lido.
*/

import java.util.Scanner;

public class Exercicio01 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int valor = input.nextInt();
		System.out.println("O valor lido foi: " + valor);
		
	}

}

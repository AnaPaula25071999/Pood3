package exerciciosLogica;

import java.util.Scanner;

public class Exercicio11 {

	public void run() {
		/* 11. Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando se A � m�ltiplo de B ou se B � m�ltiplo
		de A.*/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		int a = input.nextInt();
		System.out.print("Digite um valor para B: ");
		int b = input.nextInt();

		
		if ( (a%b) == 0) { 
			System.out.print("O n�mero "+ a + "(A) � multiplo de  " + b + "(B). ");
		} else {
			if ( (b%a) == 0) { 
				System.out.print("O n�mero "+ b + "(B) � multiplo de  " + a + "(A). ");
			} else {
				System.out.print("O n�mero "+ a + "(A) e " + b + "(B) n�o s�o multiplos. ");
			}	
		}
		
			
	}

}

package exerciciosLogica;

import java.util.Scanner;


public class Exercicio20 {

	public void run() {
		/*20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em p�s
(1 metro = 3.315 p�s), exibindo os valores dado e convertido. Caso o usu�rio forne�a um valor negativo, deve ser exibida
uma mensagem e a opera��o de convers�o n�o deve ser efetuada. */
		
		System.out.print("Digite a medida em metros:");
		Scanner input = new Scanner(System.in);
		float metro = input.nextFloat();
		double pes;
		
		if(metro>= 0) { 
			pes = metro * 3.315;
			 System.out.println(metro  + " metros = "+ pes+" p�s.");
		}else{
			System.out.print( "O valor � negativo portanto a opera��o de convers�o n�o deve ser efetuada.");
		}
	
	}
}
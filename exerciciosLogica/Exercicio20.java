package exerciciosLogica;

import java.util.Scanner;


public class Exercicio20 {

	public void run() {
		/*20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
uma mensagem e a operação de conversão não deve ser efetuada. */
		
		System.out.print("Digite a medida em metros:");
		Scanner input = new Scanner(System.in);
		float metro = input.nextFloat();
		double pes;
		
		if(metro>= 0) { 
			pes = metro * 3.315;
			 System.out.println(metro  + " metros = "+ pes+" pés.");
		}else{
			System.out.print( "O valor é negativo portanto a operação de conversão não deve ser efetuada.");
		}
	
	}
}
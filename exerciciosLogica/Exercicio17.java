package exerciciosLogica;

import java.util.Scanner;


public class Exercicio17 {

	public void run() {
		/* 17. Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
usuário forneça um valor negativo, deve ser exibida uma mensagem e a operação de conversão não deve ser efetuada. */
		Scanner input = new Scanner(System.in);
		System.out.print("Escreva um valor inteiro correspondente a uma quantidade de segundos:");
		int seg = input.nextInt();
		int hora, min, segu;
		
		if(seg < 0) {
			
			System.out.print("A operação de conversão não deve ser efetuada.");
		}else{
		
			hora = (seg)/3600;
			min = (seg%3600)/60;
			segu = (seg%3600)%60;
			
			System.out.print("O valor inteiro corresponde a "+ hora +" hora "+min+" minuto "+segu+" segundos; ");
		}
		
	
	}

}

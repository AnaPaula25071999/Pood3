package exerciciosLogica;

import java.awt.geom.Area;
import java.util.Scanner;


public class Exercicio16 {

	public void run() {
		/* 16. Preparar um programa para ler as medidas da base e da altura de um tri�ngulo, calculando e imprimindo sua �rea,
sabendo que o c�lculo da �rea � dado por:
area = (base*altura)/2.*/
		Scanner input = new Scanner(System.in);
		float area = 0;
		System.out.print("Digite a medida da altura do tri�ngulo:");
		float alt = input.nextFloat();
		System.out.print("Digite a medida da base do tri�ngulo:");
		float base = input.nextFloat();

		area = ((base*alt)/2);
		
		System.out.println("A �rea do tri�ngulo � de " + area +" m^2.");
	}

}
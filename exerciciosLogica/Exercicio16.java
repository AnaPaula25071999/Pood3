package exerciciosLogica;

import java.awt.geom.Area;
import java.util.Scanner;


public class Exercicio16 {

	public void run() {
		/* 16. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
sabendo que o cálculo da área é dado por:
area = (base*altura)/2.*/
		Scanner input = new Scanner(System.in);
		float area = 0;
		System.out.print("Digite a medida da altura do triângulo:");
		float alt = input.nextFloat();
		System.out.print("Digite a medida da base do triângulo:");
		float base = input.nextFloat();

		area = ((base*alt)/2);
		
		System.out.println("A área do triângulo é de " + area +" m^2.");
	}

}
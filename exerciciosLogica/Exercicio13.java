package exerciciosLogica;

import java.util.Scanner;


public class Exercicio13 {

	public void run() {
		/* 13. Dados 3 valores reais representando os lados de um poss�vel tri�ngulo, verifique se os mesmos formam um tri�ngulo (a
medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
tri�ngulo, descubra tamb�m se este tri�ngulo � escaleno (tr�s lados diferentes), is�sceles (dois lados iguais) ou eq�il�tero
(tr�s lados iguais). */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Primeiro cateto: ");
		int cat1 = input.nextInt();
		System.out.print("Segundo cateto: ");
		int cat2 = input.nextInt();
		System.out.print("Hipotenusa: ");
		int hip = input.nextInt();

		
		if ( (hip < cat2 + cat1) && (cat1 < cat2 + hip) && (cat2 < cat1 + hip)) { 
			System.out.print("Os 3 valores reais s�o possiveis lados de um tri�ngulo.");
			if ( (hip != cat1) && (hip != cat1) && (cat1 != cat2)){
				System.out.print("Esse tri�ngulo � escaleno.");
			}else {
				if ( (hip != cat1) || (hip != cat1) || (cat1 != cat2)){
					System.out.print("Esse tri�ngulo � is�sceles.");
				}else{
					System.out.print("Esse tri�ngulo � equil�tero.");
				}
			}
			
		} else {
				System.out.print("Os 3 valores reais n�o s�o possiveis lados de um tri�ngulo.");
		}
	
	}

}


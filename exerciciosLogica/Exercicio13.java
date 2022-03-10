package exerciciosLogica;

import java.util.Scanner;


public class Exercicio13 {

	public void run() {
		/* 13. Dados 3 valores reais representando os lados de um possível triângulo, verifique se os mesmos formam um triângulo (a
medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
triângulo, descubra também se este triângulo é escaleno (três lados diferentes), isósceles (dois lados iguais) ou eqüilátero
(três lados iguais). */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Primeiro cateto: ");
		int cat1 = input.nextInt();
		System.out.print("Segundo cateto: ");
		int cat2 = input.nextInt();
		System.out.print("Hipotenusa: ");
		int hip = input.nextInt();

		
		if ( (hip < cat2 + cat1) && (cat1 < cat2 + hip) && (cat2 < cat1 + hip)) { 
			System.out.print("Os 3 valores reais são possiveis lados de um triângulo.");
			if ( (hip != cat1) && (hip != cat1) && (cat1 != cat2)){
				System.out.print("Esse triângulo é escaleno.");
			}else {
				if ( (hip != cat1) || (hip != cat1) || (cat1 != cat2)){
					System.out.print("Esse triângulo é isósceles.");
				}else{
					System.out.print("Esse triângulo é equilátero.");
				}
			}
			
		} else {
				System.out.print("Os 3 valores reais não são possiveis lados de um triângulo.");
		}
	
	}

}


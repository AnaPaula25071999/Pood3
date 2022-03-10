package exerciciosLogica;

import java.util.Scanner;


public class Exercicio22 {

	public void run() {
		/*22. Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
PF = P0 + V * T + (A * T2
) / 2
*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real indicando posição inicial do móvel(P0): ");
		float p0 = input.nextFloat();
		System.out.print("Digite um valor real que corresponde a velocidade do móvel(V): ");
		float v = input.nextFloat();
		System.out.print("Digite um outro valor real correspondente a aceleração do móvel(A):");
		float a = input.nextFloat();
		System.out.print("Digite um número inteiro correspondente ao tempo decorrido(T):");
		int t = input.nextInt();
		float pf;
		
		
		pf =( p0+ (v * t) + (a * (t*t)) ) / 2;
		
		System.out.println(" A posição final do movel é de :"+pf+" .");
		
	
	}
}
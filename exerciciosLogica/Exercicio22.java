package exerciciosLogica;

import java.util.Scanner;


public class Exercicio22 {

	public void run() {
		/*22. Considerando um objeto m�vel em movimento uniformemente variado, escreva um programa que receba as seguintes
informa��es: um valor real indicando posi��o inicial do m�vel P0, um valor real que corresponde a velocidade do m�vel
V, um outro valor real A correspondente a acelera��o do m�vel e um n�mero inteiro correspondente ao tempo decorrido
T. O programa deve calcular a posi��o final PF do m�vel, dado pela rela��o abaixo:
PF = P0 + V * T + (A * T2
) / 2
*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real indicando posi��o inicial do m�vel(P0): ");
		float p0 = input.nextFloat();
		System.out.print("Digite um valor real que corresponde a velocidade do m�vel(V): ");
		float v = input.nextFloat();
		System.out.print("Digite um outro valor real correspondente a acelera��o do m�vel(A):");
		float a = input.nextFloat();
		System.out.print("Digite um n�mero inteiro correspondente ao tempo decorrido(T):");
		int t = input.nextInt();
		float pf;
		
		
		pf =( p0+ (v * t) + (a * (t*t)) ) / 2;
		
		System.out.println(" A posi��o final do movel � de :"+pf+" .");
		
	
	}
}
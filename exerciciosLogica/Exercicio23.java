package exerciciosLogica;

import java.util.Scanner;


public class Exercicio23 {

	public void run() {
		/*23. Escreva um programa que receba as seguintes informa��es: um valor real indicando capital inicial PV, 
		 * um valor real que corresponde a taxa de juros da aplica��o J e um n�mero inteiro de per�odos da aplica��o N. O programa deve retornar o
capital futuro FV dado pela rela��o abaixo:
FV = PV * ( 1 + J )N */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real indicando capital inicial(PV): ");
		float pv = input.nextFloat();
		System.out.print("Digite um valor real que corresponde a taxa de juros da aplica��o(j): ");
		float j = input.nextFloat();
		System.out.print("Digite um n�mero inteiro de per�odos da aplica��o(N):");
		int n = input.nextInt();
		double fv;
		
		
		fv = pv * Math.pow((1+j), n);
		
		System.out.println(" O capital futuro estimado � de "+fv+" .");
		
	
	}
}

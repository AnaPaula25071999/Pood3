package exerciciosLogica;

import java.util.Scanner;


public class Exercicio15 {

	public void run() {
		/*15. Escreva um programa que realize as seguintes tarefas:
a) Efetue a leitura de dois valores inteiros, os quais serão denominados x e y;
b) Realize a soma dos valores x e y, exibindo seu resultado;
c) Realize o produto dos valores x e y exibindo seu resultado;
d) Compare os valores x e y, indicando se "X > Y", "X = Y" e "X < Y" para os casos correspondentes. */
		Scanner input = new Scanner(System.in);
		int soma;
		int produto;
		System.out.print("Digite um valor inteiro para o x: ");
		int x = input.nextInt();
		System.out.print("Digite um valor inteiro para o y: ");
		int y = input.nextInt();

		soma = x + y;
		produto = x * y;
		System.out.println("Soma de x e y = " + soma +".");
		System.out.println("Produto de x e y = " + produto +".");
		
		if ( x > y) { 
			System.out.println(x+ " > " + y);
		} 
		if ( x < y){
			System.out.println(x+ " < " + y);
		}
		if ( x == y){
			System.out.println(x+ " = " + y);
		}
	}

}

package exerciciosLogica;

import java.util.Scanner;


public class Exercicio30{

	public void run() {
		/*30. Escreva um programa que calcule o valor de y = f(x) = a*x + b num intervalo de valores de x, sendo dados pelo usuário
os coeficientes a e b, bem como os valores do limite inferior e superior do intervalo de x bem como o valor do incremento
de x. O programa deve exibir resultados como um tabela onde constam os valores de x e y=f(x) lado a lado. */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o coeficientes a:");
		float a = input.nextFloat();
		System.out.print("Digite o coeficientes b:");
		float b = input.nextFloat();
		System.out.print("O intevalo inferior de x:");
		float xinf = input.nextFloat();
		System.out.print("O intevalo superior de x:");
		float xsup = input.nextFloat();
		System.out.print("O incremento de x:");
		float inc = input.nextFloat();
		float x, y;
		
		
		x = xinf;
		while(x <= xsup) {
			y = a*x+b;
			x = inc + x;
			System.out.println("x = "+ x +"       y = "+ a +" * "+ x +" + "+ b +" = "+ y);
		}
		
		
	}
}
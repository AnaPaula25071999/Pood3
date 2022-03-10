package exerciciosLogica;

import java.util.Scanner;


public class Exercicio24 {

	public void run() {
		/*24. Implementar três programas para exibir a tabuada de um número inteiro entre 1 e 20 dado pelo usuário.
a) Usando enquanto (while)
b) Usando faça-enquanto (do-while)
c) Usando para (for)
 Obs. Caso o valor dado seja inválido o programa deve apenas exibir uma mensagem de aviso.*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero inteiro entre 1 e 20 :");
		int num = input.nextInt();
		int i = 0, resul;
		
		if((num >= 1) && (num <= 20)) {
			
			System.out.print("Digite um modo de fazer a operação:\n"
					+ "a) Usando enquanto (while)\r\n"
					+ "b) Usando faça-enquanto (do-while)\r\n"
					+ "c) Usando para (for)\r\n"
					+ "Modo:");
			char tipo = input.next().charAt(0);
			
			switch(tipo) {
			case 'a':
				
				System.out.println("\n Usando enquanto (while):\n ");
				while(i <= 10) {
					resul = num * i;
					System.out.println(num +" x " + i +" = "+ resul);
					i++;
				}
				
			break;
			case 'b':
				
				System.out.println("\n Usando faça-enquanto (do-while):\n ");
				do{
					resul = num * i;
					System.out.println(num +" x " + i +" = "+ resul);
					i++;
				}while(i <= 10);
				
			break;
			case 'c':
				
				System.out.println("\n Usando para (for):\n ");
				for(i = 0;i <= 10;i++) {
					resul = num * i;
					System.out.println(num +" x " + i +" = "+ resul);
				}
				
			break;
			default:
				System.out.println("O modo inserido não exixte;.");
			break;
			}
			
		}else {
			System.out.println("Valor inválido!!! Digite um valor no intervalo de 1 a 20.");
		}

		
	}
}
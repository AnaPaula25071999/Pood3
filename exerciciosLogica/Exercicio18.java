package exerciciosLogica;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;


public class Exercicio18 {

	public void run() {
		/* 18. Escreva um programa que leia um número inteiro entre 0 e 100 e o exiba por extenso, por exemplos: 16 -> "dezesseis",
34 -> "trinta e quatro", etc.. */
		
		System.out.print("Escreva um valor inteiro para ser exibido em extenso:");
		Scanner input = new Scanner(System.in);
		String[] vet1 = new String[] {"zero","um","dois","tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze","doze","treze","catorze","quinze","dezesseis","dezessete", "dezoito", "dezenove"};
		String[] vet2 = new String[] {"vinte","trinta","quarenta","cinquenta","sessenta", "setenta", "oitenta", "noventa", "cem"};
		int num = input.nextInt();
		int d, resto;
		d = num/10;
		
		if((d==0)||(d==1)) { 
			 System.out.print(num + " --> " + vet1[num]);
		}else {
			if((d>=2)&&(d<=10)) { 
				resto = num%10;
				if(resto==0) {
					System.out.print(num + " --> " + vet2[d-2]);
				}else {
					System.out.print(num + " --> " + vet2[d-2] + " e " + vet1[resto]);
				}
			}
		}
	}


}

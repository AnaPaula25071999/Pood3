package exerciciosLogica;

import java.util.Scanner;



public class Exercicio19 {

	public void run() {
		/* 18. Escreva um programa que leia um número inteiro entre 0 e 100 e o exiba por extenso, por exemplos: 16 -> "dezesseis",
34 -> "trinta e quatro", etc.. */
		
		String[] vet1 = new String[] {"zero","um","dois","tres", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez", "onze","doze","treze","catorze","quinze","dezesseis","dezessete", "dezoito", "dezenove"};
		String[] vet2 = new String[] {"vinte","trinta","quarenta","cinquenta","sessenta", "setenta", "oitenta", "noventa", "cem"};
		Scanner input = new Scanner(System.in);
		System.out.print("Escreva um valor inteiro para ser exibido em extenso:");
		float num = input.nextFloat();
		int d, resto;
		int c,num_c;
		int inteira = (int) num;
		
		d = inteira/10;
		
		if((d==0)||(d==1)) { 
			if(inteira==1 || inteira==0) {
				System.out.print(vet1[inteira] + " real" );
			}else {
				System.out.print(vet1[inteira] + " reais" );
			}
		}else {
			if((d>=2)&&(d<=10)) { 
				resto = (int)num%10;
				if(resto==0) {
					System.out.print(vet2[d-2] + "reais");
				}else {
					System.out.print(vet2[d-2] + " e " + vet1[resto] + "reais");
				}
			}
		}
		
		num_c = (int)Math.round((num - inteira)*100);
		c = num_c/10;
		if((c==0)||(c==1)) { 
			 System.out.print(" e " + vet1[num_c] + " centavos");
		}else {
			
			if((c>=2)&&(c<=10)) { 
				resto = (int)num_c%10;
				if(resto==0) {
					System.out.print(" e " + vet2[c-2] +" centavos");
				}else {
					System.out.print(" e " + vet2[c-2] + " e " + vet1[resto]+ " centavos");
				}
			}
			
		}
	}


}
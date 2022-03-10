package exerciciosLogica;


public class Exercicio28{

	public void run() {
		/*28. Faça um programa que exiba a tabela verdade da operação E-Lógico para todas as combinações de três variáveis lógicas
A, B e C. Os resultados da tabela devem ser exibidos como F ou V.*/

		int i,j,k;
		boolean a, b, c, r;
		char at,bt,ct,rt;
		System.out.println("   A   B   C     Resultado\n");	
		for(i=1;i>=0;i--) {
			if(i==0) {
				a=false;
			}else {
				a=true;
			}
		
			for(j=1;j>=0;j--) {
				
				if(j==0) {
					b=false;
				}else {
					b=true;
				}
			
				for(k=1;k>=0;k--) {
					if(k==0) {
						c=false;
					}else {
						c=true;
					}
					r = ((a)&&(b)&&(c));
					if(a==true) {
						at='V';
					}else {
						at='F';
					}
					if(b==true) {
						bt='V';
					}else {
						bt='F';
					}
					if(c==true) {
						ct='V';
					}else {
						ct='F';
					}
					if(r==true) {
						rt='V';
					}else {
						rt='F';
					}
					System.out.println("   "+at+"   "+bt+"   "+ct+"       "+rt);	
					
				}
			}
		}
	}
}	
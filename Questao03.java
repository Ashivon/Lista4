import java.util.Scanner;
import java.util.Random;
public class Questao03 {
/*Fazer um algoritmo que percorre um vetor de 100 números, calcular e escrever se
cada número é positivo ou negativo, e múltiplo ou não de 3, ao mesmo tempo. Como
Reposta: preencher os seguintes vetores
a) Números positivos múltiplos de 3
b) Números positivos não múltiplos de 3
c) Números negativos múltiplos de 3
d) Números negativos não múltiplos de 3*/
	public static void Multiplosde3(int vet[]) {
		int posmult3=0, posnmult3=0, negmult3=0, negnmult3=0;
		for(int i=0; i<vet.length; i++) {
			if(vet[i]>=0) {
				if(vet[i]%3==0)
					posmult3++;
				if(vet[i]%3==1)
					posnmult3++;
			}
			if(vet[i]<0) {
				if(vet[i]%3==0)
					negmult3++;
				if(vet[i]%3==-1)
					negnmult3++;
			}
		}		
		System.out.println("Positivos Multiplos de 3(PM3): "+posmult3+"\nPositivos Não Multiplos de 3(PNM3): "+posnmult3);
		System.out.println("Negativos Multiplos de 3(NM3): "+negmult3+"\nNegativos Não Multiplos de 3(NNM3): "+negnmult3);
	}
	
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int tamanho;
		System.out.println("Digite o tamanho do vetor:");
		tamanho=ler.nextInt();
		
		int vet[]=new int[tamanho];
//		Random gerar=new Random();
//		for(int i=0; i<tamanho; i++) {
//			vet[i]=gerar.nextInt(100);
//		}
		
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento:");
			vet[i]=ler.nextInt();
		}
		
		Multiplosde3(vet);
	}

}

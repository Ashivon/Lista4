import java.util.Scanner;
public class Questao04 {
/*Criar um programa que receba um vetor com nomes e retorne quais letras são
vogais e quais são as constantes para cada nome. Usar uma função que verifica se
é uma vogal ou consoante.*/
	public static void VerificaNome(String[] vet) {
		for(int i=0; i<vet.length; i++) {
			
		}
	}
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int tamanho;
		System.out.println("Digite o tamanho do vetor:");
		tamanho=ler.nextInt();
		
		String vetor[]=new String[tamanho];
		for(int i=0; i<tamanho; i++) {
			System.out.println("Digite o "+(i+1)+"° elemento:");
			vetor[i]=ler.next();
		}
		String teste;
		teste = ler.next();
		teste.charAt(0);
		VerificaNome(vetor);
	}

}

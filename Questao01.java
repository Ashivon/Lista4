import java.util.Scanner;
public class Questao01 {
/*Desenvolver um algoritmo que determine o imposto de renda cobrado de um
funcionário pelo governo. Seu programa deverá ler o valor do salário mínimo, o
número de dependentes, o salário do funcionário e a taxa de imposto normal que já
foi paga pelo funcionário. O imposto bruto é:
● 20% do salário do funcionário se o funcionário ganha mais de 12 salários
mínimos;
● 8% do salário do funcionário se o funcionário ganha mais de 5 salários
mínimos e
● Quem ganha menos ou igual de 5 salários mínimos não é cobrado o imposto
de renda.

Obs.: A cada número de dependentes, ganha 2% de restituição.
Obs.: Sabe-se que o governo cobra 4% de taxa adicional sobre o IMPOSTO BRUTO.*/
	public static void impostoderenda(int numdepen, int sal, int quantsal, double imposbrut) {
		double restituicao=0;
		
		if(quantsal>=12) {
			imposbrut=((sal*20)/100);
			System.out.println("recebendo imposbrut(>=12): "+imposbrut);
		}
		else if(quantsal<12 && quantsal>=5) {
			imposbrut=((sal*8)/100);
			System.out.println("recebendo imposbrut(<12 e >=5): "+imposbrut);
		}
		else {
			imposbrut=0;
			System.out.println("recebendo imposbrut(<5): "+imposbrut);
		}
		restituicao=((sal*2)/100)*numdepen;
		
		System.out.println("Seu imposto de renda é: "+imposbrut+"\nVocê tem uma restituição de: "+restituicao);
		return;
	}
	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		int numdepen, quantsal, sal, taximpos, salmin;
		double imposbrut=0;
		
		System.out.println("Digite o salário mínimo:");
		salmin=ler.nextInt();
		System.out.println("Digite o número de dependentes:");
		numdepen=ler.nextInt();
		System.out.println("Digite o salário:");
		sal=ler.nextInt();
		quantsal=sal/salmin;
		
		System.out.println("Digite a taxa de imposto:");
		taximpos=ler.nextInt();
		
		impostoderenda(numdepen, sal, quantsal, imposbrut);
	
	}

}

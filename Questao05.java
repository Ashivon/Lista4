import java.util.Scanner;
public class Questao05 {
/*Faça o seguinter programa:
 *Receba 3 vetores e mostre para cada vetor: a soma, o produto e a média dos
elementos de cada vetor*/
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//CRIANDO VETORES
		int vetor1[] = new int [5];
		int vetor2[] = new int [5];
		int vetor3[] = new int [5];
		
		for(int i=0; i<vetor1.length; i++) {
			System.out.println("Digite um elementodo vetor 1:");
			vetor1[i]=ler.nextInt();
		}
		for(int i=0; i<vetor2.length; i++) {
			System.out.println("Digite um elementodo vetor 2:");
			vetor2[i]=ler.nextInt();
		}
		for(int i=0; i<vetor3.length; i++) {
			System.out.println("Digite um elementodo vetor 3:");
			vetor3[i]=ler.nextInt();
		}
		
		//APRESENTAÇÕES
		SomaProdutoMediaQuestao05 calcular1= new SomaProdutoMediaQuestao05(vetor1);
		ApresentaçãoQuestao05 mostrar1 = new ApresentaçãoQuestao05(calcular1);
		System.out.println("\nVETOR 1:"+mostrar1.getSaida());
		
		SomaProdutoMediaQuestao05 calcular2= new SomaProdutoMediaQuestao05(vetor2);
		ApresentaçãoQuestao05 mostrar2 = new ApresentaçãoQuestao05(calcular2);
		System.out.println("\nVETOR 2:"+mostrar2.getSaida());
		
		SomaProdutoMediaQuestao05 calcular3= new SomaProdutoMediaQuestao05(vetor3);
		ApresentaçãoQuestao05 mostrar3 = new ApresentaçãoQuestao05(calcular3);
		System.out.println("\nVETOR 3:"+mostrar3.getSaida());
		
		/*Depois gere um vetor que tenha a soma de todas as somas computadas, outro vetor
com o produto de todas as produtos computados e por fim um terceiro que tenha
todas as médias computadas.*/
		
		int vetsomas[] = new int [3];
		int vetprodut[] = new int [3];
		int vetmedia[] = new int [3];
		
		System.out.println("\n-----Os calculos gerados foram:-----");
		for(int i=0; i<vetsomas.length; i++) {
			if(i==0) {
				SomaProdutoMediaQuestao05 recalcular1= new SomaProdutoMediaQuestao05(vetor1);
				vetsomas[i]=recalcular1.getSoma();
				vetprodut[i]=recalcular1.getProduto();
				vetmedia[i]=recalcular1.getMedia();
			}
			if(i==1) {
				SomaProdutoMediaQuestao05 recalcular2= new SomaProdutoMediaQuestao05(vetor2);
				vetsomas[i]=recalcular2.getSoma();
				vetprodut[i]=recalcular2.getProduto();
				vetmedia[i]=recalcular2.getMedia();
			}
			if(i==2) {
				SomaProdutoMediaQuestao05 recalcular3= new SomaProdutoMediaQuestao05(vetor3);
				vetsomas[i]=recalcular3.getSoma();
				vetprodut[i]=recalcular3.getProduto();
				vetmedia[i]=recalcular3.getMedia();
			}
			System.out.println("\nSomas do vetor "+(i+1)+": "+vetsomas[i]);
			System.out.println("Produto do vetor "+(i+1)+": "+vetprodut[i]);
			System.out.println("Media do vetor "+(i+1)+": "+vetmedia[i]);
		}
		
		/*Calcule a soma do vetor que contém todas as somas, calcule a média do vetor que
contém todas as médias e calcule o produto do vetor que contém todos os produtos
calculados.*/
		int somas=0, produtos=1;
		double medias=0;
		
		for(int i=0; i<3; i++) {
			somas+=vetsomas[i];
			produtos=produtos*vetprodut[i];
			medias=vetmedia[i];
		}
		medias=medias/3;
		System.out.println("\nOs valores globais são:\nSOMA TOTAL: "+somas+"\nPRODUTO TOTAL: "+produtos+"\nMEDIA TOTAL: "+medias);
	}

}

import java.util.Scanner;
public class Questao02 {
/*Um aluguel de ferramentas tem a seguinte regra para aluguel.
● As segundas, terças e quintas: um desconto de 40% em cima do preço normal;
● Às quartas, sextas, sábados e domingos: preço normal;
● Aluguel de ferramentas comuns: preço normal e ferramentas novas: acréscimo de
15% em cima do preço normal.
Obs.: O dia da semana deve ser tratado como String.*/
	public static Scanner ler=new Scanner(System.in);
	
	public static void CalcularAluguel(double aluguel, double valorTotal) {
		String diasem;
		int escolha, tipo;
		
		System.out.println("Você deseja:\n1-Ferramenta Nova;\n2-Ferrameta Comum;");
		tipo=ler.nextInt();
		System.out.println("Digite o dia da semana para alugar:");
		diasem=ler.next();
		
		if(tipo==1)
			aluguel=aluguel+((aluguel*15)/100);
		
		if(diasem.equals("segunda") || diasem.equals("terça") || diasem.equals("quinta")) {
			aluguel=aluguel-((aluguel*40)/100);
			System.out.println("O aluguel ficará por: "+aluguel);
		}
		if(diasem.equals("quarta") || diasem.equals("sexta") || diasem.equals("sábado") || diasem.equals("domingo")) {
			System.out.println("O aluguel ficará por: "+aluguel);
		}
		
		System.out.println("Deseja alugar mais alguma ferramenta?\n1-Sim // 2-Não");
		escolha=ler.nextInt();
		if(escolha==1) {
			valorTotal+=aluguel;
			aluguel=30.0;
			CalcularAluguel(aluguel, valorTotal);
		} else {
			valorTotal+=aluguel;
			System.out.println("TOTAL: R$"+valorTotal);
		}
	}
	
	public static void main(String[] args) {
		double valorTotal=0, aluguel=30.0;
		
		System.out.println("---- ALUGUEL DE FERRAMENTAS -----");
		
		CalcularAluguel(aluguel, valorTotal);
	}

}

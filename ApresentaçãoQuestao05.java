public class ApresentaçãoQuestao05 {
	public String saida;
	
	public ApresentaçãoQuestao05(SomaProdutoMediaQuestao05 valor) {
		setSaida(valor);
	}
	
	public String getSaida() {
		return saida;
	}
	public void setSaida(SomaProdutoMediaQuestao05 valor) {
		saida+="\nA soma dos elementos é: "+valor.getSoma();
		saida+="\nA soma dos elementos é: "+valor.getProduto();
		saida+="\nA soma dos elementos é: "+valor.getMedia();
	}
}

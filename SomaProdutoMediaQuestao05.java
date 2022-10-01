public class SomaProdutoMediaQuestao05 {
	public int soma=0, produto=1;
	public int media=1;
	
	public SomaProdutoMediaQuestao05(int vet[]) {
		setSoma(vet);
		setProduto(vet);
		setMedia(vet);
	}

	public int getSoma() {
		return soma;
	}
	public void setSoma(int vet[]) {
		for(int i=0; i<vet.length; i++) {
			soma+=vet[i];
		}
		this.soma = soma;
	}

	public int getProduto() {
		return produto;
	}
	public void setProduto(int vet[]) {
		for(int i=0; i<vet.length; i++) {
			produto=produto*vet[i];
		}
		this.produto = produto;
	}

	public int getMedia() {
		return media;
	}
	public void setMedia(int vet[]) {
		this.media = media*(soma/vet.length);
	}
	
}

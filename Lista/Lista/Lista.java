package Lista;



public class Lista {
	public long tamanho;
	public No inicio;
	public No fim;
	
	public boolean estaVazia() {
		
		return tamanho ==0;
	}
	
	public Object get(int indice) {
		if (indice<0|| indice>=tamanho) return null;
		if (indice == 0) return inicio.info;
		if (indice == tamanho-1) return fim.info;
		
		No atual= inicio;
		for(int i=1; i <=indice; i++) {
			atual= atual.prox;
			if( i == indice) return atual.info;
		}
		System.out.println("num deu não");
		return null;
	}
	
	public boolean remover(int indice) {
		if (indice <0|| indice>= tamanho)return false; 
		if (indice ==0) inicio = inicio.prox;
		
		No noAtual = inicio;
		for (int i =1; i <tamanho; i++) {
			noAtual = noAtual.prox;
			if(i== indice -1) {
				noAtual.prox = noAtual.prox.prox;
			} 
		}	
		if(indice ==tamanho -1) fim = noAtual;
		tamanho--;
		return true;
	}
	
	
	
	public void adicionar(Object info) {
		No no = new No(info);
		if (estaVazia()) {
			inicio= no;
		}
		else {
			fim.prox=no;
		}
			fim = no;
			tamanho++;	
	}
	
	
}

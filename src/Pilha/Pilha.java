package Pilha;

public class Pilha {
	No topo;
	int tamanho = 0;
	
	boolean estaVazia() {
		return tamanho == 0;
	}
	
	Object topo() {
		if (estaVazia()) 
			return null;
		else 
			return topo.info;
		
	}
	
	public void empilhar(Object info) {
		No no = new No(info);
		if (!estaVazia()) {
			no.prox=topo;
		}
			topo=no;
			tamanho++;	
	}
	
	
	
	
	
	
	
}

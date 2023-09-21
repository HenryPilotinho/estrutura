package Pilha;

public class Pilha {
	private No topo;
	private int tamanho = 0;
	
	
	
	public No getTopo() {
		return topo;
	}

	public int getTamanho() {
		return tamanho;
	}

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
	
	Object desempilhar() {
		if (estaVazia()) {
			return null;
		}
		Object info = topo.info;
		topo = topo.prox;
		tamanho--;
		return info;
	}
	
	
	
	
	
}

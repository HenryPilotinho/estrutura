package Pilha;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		pilha.empilhar("face");
		pilha.empilhar("duolingo");
		pilha.empilhar("insta");
		pilha.empilhar("batata");
		pilha.empilhar("nerson");
		
		
		imprimirPilha(pilha);
		//crie um metodo na main q imprima todos os itens da pilha
		receberPilha(pilha);
		//crie um metodo na main q receba uma pilha e retorne a pilha invertida
		
		
	}
	
	private static void receberPilha(Pilha pilha) {
		
		
	}

	private static void imprimirPilha(Pilha pilha) {
		while(!pilha.estaVazia()) {
			System.out.println(pilha.getTamanho());
			System.out.println(pilha.desempilhar());
		}
		
	}

	void testes() {
		Pilha pilha = new Pilha();
		System.out.println("esta nelson "+ pilha.estaVazia());
		pilha.empilhar("face");
		System.out.println("NELSON "+ pilha.topo());
		System.out.println("esta nelson "+ pilha.estaVazia());
		pilha.empilhar("g1");
		System.out.println("NELSON "+ pilha.topo());
		System.out.println("TAMANHO DO NELSON "+ pilha.getTamanho());
		
		System.out.println("Ficando nelsin "+ pilha.desempilhar());
		System.out.println("NELSON "+ pilha.topo());
		System.out.println("TAMANHO DO NELSON "+ pilha.getTamanho());
	}
	

}

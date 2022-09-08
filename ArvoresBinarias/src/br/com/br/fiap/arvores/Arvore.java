package br.com.br.fiap.arvores;

public class Arvore {/* lista encadeada ainda nao estamos vendo arvore
	revisao semestre passado*/
	
	private class NO{
		int dado;
		NO prox;
	}
	
	NO lista = null;
	
	public void inserir(int valor) {
		System.out.println("Antes de inserir a lista esta : "+ lista);
		NO novo = new NO();
		
		novo.dado = valor;
		novo.prox = lista;
		
		System.out.println("Novo : "+novo + " Dado :"+novo.dado+" prox : "+novo.prox);
		
		lista = novo;
		
		System.out.println("a lista no fim esta : "+lista);
	}
	
}

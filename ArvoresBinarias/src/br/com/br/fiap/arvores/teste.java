package br.com.br.fiap.arvores;

import java.util.Scanner;



public class teste {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		ABBint abb = new ABBint();
		int opcao;
		
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresentar n�s em ordem crescente");
			System.out.println("3 - Apresenta quantidade de n�s");
			System.out.println("4 - Consulta o valor inserido");
			System.out.println("5 - Quantos n�s para chegar ao n�mero desejado");
			System.out.println("6 - Remover dado da ABB");
			
			opcao = teclado.nextInt();
			
			switch(opcao) {
				case 0:
					System.out.println("Finalizado o processo !");
					break;
				case 1:
					System.out.println("Informe o valor a ser inserido na ABB: ");
						int info = teclado.nextInt();
						abb.raiz = abb.inserir(abb.raiz, info);
					break;
				case 2:
					System.out.println("Apresenta ABB");
					abb.ListaEmOrdem(abb.raiz);
					break;
				case 3:
					System.out.println("A quantidade de n�s = "+abb.ContaNos(abb.raiz, 0));
					break;
				case 4:
					System.out.print("Informe o valor a ser pesquisado -> ");
						info = teclado.nextInt();
					boolean achou = abb.Consulta(abb.raiz, info);
					if(achou) {
						System.out.println("Existe esse dado na �rvore");
					}else {
						System.out.println("N�o existe esse dado na �rvore");
					}
					break;
				case 5:
					System.out.print("Informe o valor a ser pesquisado -> ");
						info = teclado.nextInt();
					int contador = abb.ContaConsulta(abb.raiz, info, 0);
					if(contador == 0) {
						System.out.println("Esse n�mero n�o existe na ABB");
					}else {
						System.out.println("A quantidade de pesquisa para achar o n�mero foi de "+ contador);
					}
					break;
				case 6:
					System.out.println("Qual n�mero deseja remover da ABB");
						info = teclado.nextInt();
					abb.raiz = abb.Remocao(abb.raiz, info);
					break;
				default:
					System.out.println("Op��o inv�lida.");
			}
			
		}while(opcao != 0);
	}
}

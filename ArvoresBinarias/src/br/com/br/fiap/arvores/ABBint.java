package br.com.br.fiap.arvores;

public class ABBint {
	
	private class ARVORE{
		int dado;
		ARVORE esq, dir;
	}

	private static final String ListaEmOrdem = null;
	
	public ARVORE raiz = null;
	
	public ARVORE inserir(ARVORE p, int info) {
		
		if(p == null) {
			p = new ARVORE();
			p.dado = info;
			p.esq = null;
			p.dir = null;
		}else if(info < p.dado){
				p.esq = inserir(p.esq, info);
			}else {
				p.dir = inserir(p.dir, info);
			}
		return p;
	}
	
	public void ListaEmOrdem(ARVORE p) {
		
		if(p != null) {
			
			ListaEmOrdem(p.esq);
			System.out.println("\t "+p.dado);
			ListaEmOrdem(p.dir);
		}
	}
	public int ContaNos(ARVORE p, int cont) {
		
		
		if(p != null) {
			cont++;
			cont = ContaNos(p.esq, cont);
			cont = ContaNos(p.dir, cont);
		}
			
		return cont;
	}
	
	public boolean Consulta(ARVORE p, int dado) {
		
		if(p == null) {
			return false;
		}else {
			if(p.dado == dado) {
				return true;
			}else {
				if(dado < p.dado)
					return (Consulta(p.esq, dado));
				else
					return (Consulta(p.dir, dado));
			}
		}
	
	}
	
	public int ContaConsulta(ARVORE p, int dado, int cont) {
		
		if(p == null) {
			return 0;
		}else{
			if(p.dado == dado) {
				cont ++;
				return cont;
			}else if(p.dado != dado) {
					cont++;
					if(p.dado > dado) {
						return (ContaConsulta(p.esq, dado, cont));
					}else {
						return (ContaConsulta(p.dir, dado, cont));
					}
					
				}
		}
		return cont;
	}
	
	public ARVORE Remocao(ARVORE p, int dado) {
		
		if(p!= null) {
			if(dado == p.dado) {
				if(p.esq == null && p.dir == null) {
					return null;
				}
				if(p.esq == null) {
					return p.dir;
				}else if(p.dir == null) {
					return p.esq;
				}
			}else {
				ARVORE aux, ref;
				ref = p.dir;
				aux = p.dir;
				while(aux.esq != null) {
					aux = aux.esq;
					aux.esq = p.esq;
					return ref;
				}
			}
		}else {
			if(dado < p.dado) {
				p.esq = Remocao(p.esq, dado);
			}else {
				p.dir = Remocao(p.dir, dado);
			}
		}
		return p;
	}
	
}

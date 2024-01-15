package com.loiane.estruturaDados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public boolean adiciona(String elemento) {
		aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adiciona(int posicao, String elemento) {
		
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição ivalida");
		}
			
		aumentarCapacidade();
		
		//mover todos os elementos
		for(int i=tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho ++;
		
	  return true;
	}
	

	private void aumentarCapacidade() {
		if(tamanho == elementos.length) {
			String[] novoVetor = new String[this.elementos.length * 2];
			for(int i=0; i<this.tamanho; i++) {
				novoVetor[i] = this.elementos[i];
			}
			this.elementos = novoVetor;
		}
	}
	
	
	public int getTamanho() {
		return tamanho;
	}

	/*
	 * aqui a busca acontece pela posição do elemento no vetor. o retorno será o
	 * nome do elemento que está na posição indicada.
	 */
	public String busca(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição ivalida");
		}
		return this.elementos[posicao];
	}

	/*
	 * fazer busca de um elemento pelo nome do mesmo. nesse caso o returno será a
	 * posição que o elemento digitado se encontra.
	 */
	public int busca(String elemento) {

		for (int i = 0; i < tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	/* B D E F F -> Posição a ser removida é 1 (G)
	 * 0 1 2 3 4 -> tamanho é 5
	 * vetor[1] == vetor[2]
	 * vetor[2] == vetor[3]
	 * vetor[3] == vetor[4]
	 * 
	 */
	
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição ivalida");
		}
		
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho --; 
		
	}

	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}// fim do toString

}

/*
 * public void adiciona(String elemento) { for(int i=0; i<elementos.length; i++)
 * { if(this.elementos[i] == null) { this.elementos[i] = elemento; break; }//fim
 * do if }//fim do for }
 */

/*
 * public void adiciona(String elemento) throws Exception {
 * 
 * if(this.tamanho < this.elementos.length) { this.elementos[this.tamanho] =
 * elemento; this.tamanho++; }else { throw new
 * Exception("o vetor já está cheio, não é possivel adicionar mais elementos");
 * } }
 */

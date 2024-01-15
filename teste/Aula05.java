package com.loiane.estruturaDados.teste;

import com.loiane.estruturaDados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		
		vetor.adiciona("Curso");
		vetor.adiciona("Estrutura de dados");
		
		System.out.print("elemento da posição 1: ");
		System.out.println(vetor.busca(1));
		System.out.print("Elemento da posição 3: ");
		System.out.println(vetor.busca(3));
	}

}

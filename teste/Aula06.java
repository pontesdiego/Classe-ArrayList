package com.loiane.estruturaDados.teste;

import com.loiane.estruturaDados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		
		vetor.adiciona("diego");
		vetor.adiciona("mateus");
		
		System.out.println(vetor.busca("diego"));
		System.out.println(vetor.busca(0));

	}

}

package com.loiane.estruturaDados.teste;

import com.loiane.estruturaDados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		
			vetor.adiciona("diego");
			vetor.adiciona("mateus");
	
		
		System.out.println(vetor.getTamanho());
		
		System.out.println(vetor);

	}

}

package com.loiane.estruturaDados.teste;

import com.loiane.estruturaDados.vetor.Vetor;

public class Aula08 {

	public static void main(String[] args) {
    Vetor vetor = new Vetor(3);
		
		
		vetor.adiciona("A"); 
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		
		System.out.println(vetor);
		
		System.out.println(vetor.getTamanho());

	}

}

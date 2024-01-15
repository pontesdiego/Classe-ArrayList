package com.loiane.estruturaDados.teste;

import com.loiane.estruturaDados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
     Vetor vetor = new Vetor(10);
		
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		
		System.out.println("Vetor com elemento adicionado: ");
		
		System.out.println(vetor);
		
		vetor.adiciona(4, "E");
		
		System.out.println(vetor);
		
		
	}

}

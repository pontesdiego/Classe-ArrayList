package com.loiane.estruturaDados.teste;

import com.loiane.estruturaDados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Diego", 719820525, "Diegopontes30.04@gmail.com");
		Contato c2 = new Contato("Mateus", 719820525, "Takashi30@gmail.com");
		Contato c3 = new Contato("Jõao", 719820525, "jacinto@gmail.com");
		
		Contato c4 = new Contato("Diego", 719820525, "Diegopontes30.04@gmail.com");
		
		 vetor.adiciona(c1);
		 vetor.adiciona(c2);
		 vetor.adiciona(c3);
		 
		 int pos = vetor.busca(c4);
		 if(pos > -1) {System.out.println("Elemento existe no vetor!"); }
		 else {System.out.println("Elemento não existe no vetor!");}
		 
		 System.out.println(vetor);
		 
		 System.out.println();
	}

}

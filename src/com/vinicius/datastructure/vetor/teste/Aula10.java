package com.vinicius.datastructure.vetor.teste;

import com.vinicius.datastructure.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) throws Exception {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Vinicius","36363636","email@email.com");
		Contato c2 = new Contato("Set","36363636","email@email.com");
		Contato c3 = new Contato("Vencedor","36363636","email@email.com");
		Contato c4 = new Contato("Vencedor","36363636","email@email.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if(pos > -1){
			System.out.println("Elemento existe no vetor");
		}else{
			System.out.println("Elemento não existe no vetor");
		}
		
		
		System.out.println(vetor);
	}

}

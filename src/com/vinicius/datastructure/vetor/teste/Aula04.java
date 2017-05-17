package com.vinicius.datastructure.vetor.teste;

import com.vinicius.datastructure.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona2("elemento 1");
		vetor.adiciona2("elemento 2");
		vetor.adiciona2("elemento 3");

		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
	}

}

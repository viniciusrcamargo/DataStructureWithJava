package com.vinicius.datastructure.vetor.teste;

import com.vinicius.datastructure.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) throws Exception {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("F");
		vetor.adiciona("G");
		vetor.adiciona("H");
		vetor.adiciona("I");
		vetor.adiciona("Y");
		vetor.adiciona("R");
		vetor.adiciona("E");

		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		
		System.out.println(vetor);
		
		vetor.adiciona(3, "W");
		
		System.out.println(vetor);
	}

}

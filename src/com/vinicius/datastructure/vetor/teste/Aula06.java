package com.vinicius.datastructure.vetor.teste;

import java.util.Vector;

import com.vinicius.datastructure.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) throws Exception {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.busca("elemento 1"));
		System.out.println(vetor.busca("elemento 4"));

	}

}

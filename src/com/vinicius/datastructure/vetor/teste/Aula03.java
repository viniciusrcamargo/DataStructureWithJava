package com.vinicius.datastructure.vetor.teste;

import com.vinicius.datastructure.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(2);
		
		try{
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		vetor.adiciona2("elemento 1");
		vetor.adiciona2("elemento 2");
		vetor.adiciona2("elemento 3");

	}

}

package com.vinicius.datastructure.vetor.labs;

import com.vinicius.datastructure.vetor.Lista;

public class Exer03 {

	public static void main(String[] args) throws Exception {

		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("N");
		lista.adiciona("G");
		lista.adiciona("P");
		lista.adiciona("N");
		
		System.out.println(lista);
		
		lista.remove("G");
		
		System.out.println(lista);

	}

}

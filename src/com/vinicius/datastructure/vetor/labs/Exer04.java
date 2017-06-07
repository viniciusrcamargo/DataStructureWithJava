package com.vinicius.datastructure.vetor.labs;

import com.vinicius.datastructure.vetor.Lista;

public class Exer04 {

	public static void main(String[] args) throws Exception {
		
		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("N");
		lista.adiciona("G");
		lista.adiciona("P");
		lista.adiciona("N");

		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(1));
		System.out.println(lista.obtem(4));
	}

}

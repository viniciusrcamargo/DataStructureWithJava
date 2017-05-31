package com.vinicius.datastructure.vetor.labs;

import com.vinicius.datastructure.vetor.Lista;

public class Exer01 {

	public static void main(String[] args) throws Exception {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("M");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("EU"));
		
		

	}

}

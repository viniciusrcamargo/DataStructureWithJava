package com.vinicius.datastructure.vetor.labs;

import java.util.ArrayList;

import com.vinicius.datastructure.vetor.Lista;

public class Exer02 {

	public static void main(String[] args) throws Exception {
		
		ArrayList<String> arrayList = new ArrayList<String>(6);
		
		arrayList.add("B");
		arrayList.add("K");
		arrayList.add("J");
		arrayList.add("B");
		
		System.out.println(arrayList.lastIndexOf("B"));
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("N");
		lista.adiciona("G");
		lista.adiciona("P");
		lista.adiciona("N");

		System.out.println(lista.ultimoIndice("N"));
	}

}

package com.vinicius.datastructure.pilha.labs;

import com.vinicius.datastructure.pilha.Pilha;

public class Exer05 {

	public static void main(String[] args) {
		String palavra = "ADA";
		
		System.out.println(palavra + " é palíndromo? = " + testaPalindromo(palavra));

	}
	
	public static boolean testaPalindromo(String palavra) {
		Pilha<Character> pilha = new Pilha<Character>();
		
		for(int i=0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		while(!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}
		
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}
		return false;
	}

}

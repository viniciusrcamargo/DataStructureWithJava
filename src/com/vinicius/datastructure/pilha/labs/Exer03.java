package com.vinicius.datastructure.pilha.labs;

import com.vinicius.datastructure.pilha.Pilha;

public class Exer03 {

	public static void main(String[] args) {
		
		Pilha<Livro> pilha = new Pilha<Livro>(20); 
		
		Livro livro1 = new Livro();
		livro1.setNome("O Poder do Agora");
		livro1.setAutor("Paulo Vieira");
		livro1.setAnoLancamento(2010);
		livro1.setIsbn("BVDFRF");

		Livro livro2 = new Livro();
		livro2.setNome("O Poder do Amanhã");
		livro2.setAutor("Paulo Sinq");
		livro2.setAnoLancamento(2009);
		livro2.setIsbn("HKJHDKA");
		
		Livro livro3 = new Livro();
		livro3.setNome("O Poder");
		livro3.setAutor("Paulo Junqueira");
		livro3.setAnoLancamento(1990);
		livro3.setIsbn("KJFAIII");
		
		Livro livro4 = new Livro();
		livro4.setNome("Por que Fazemos o que Fazemos");
		livro4.setAutor("Mario Sergio Cortela");
		livro4.setAnoLancamento(1999);
		livro4.setIsbn("ljfjaoF");
		
		System.out.println("Pilha de livros criadas, pilha está vazia? " + pilha.estaVazia());
		System.out.println("Empilhando livros na pilha: ");
		
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		pilha.empilha(livro3);
		pilha.empilha(livro4);
		
		System.out.println(pilha.tamanho() + " livros foram empilhados");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criadas, pilha está vazia? " + pilha.estaVazia());
		
		System.out.println("Espiando o topo da pilha " + pilha.topo());
		
		System.out.println("Desempilhando livros da pilha:");
		
		while(!pilha.estaVazia()) {
			System.out.println("desempilhando livro " + pilha.desempilha());
		}
		
		System.out.println("Todos os livros foram desempilhados " + pilha.estaVazia());
		
	}

}

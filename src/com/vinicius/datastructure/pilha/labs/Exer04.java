package com.vinicius.datastructure.pilha.labs;

import java.util.Stack;

import com.vinicius.datastructure.pilha.Pilha;

public class Exer04 {

	public static void main(String[] args) {
		Stack<Livro> pilha = new Stack<Livro>(); 
		
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
		
		System.out.println("Pilha de livros criadas, pilha está vazia? " + pilha.isEmpty());
		System.out.println("Empilhando livros na pilha: ");
		
		pilha.push(livro1);
		pilha.push(livro2);
		pilha.push(livro3);
		pilha.push(livro4);
		
		System.out.println(pilha.size() + " livros foram empilhados");
		System.out.println(pilha);
		
		System.out.println("Pilha de livros criadas, pilha está vazia? " + pilha.isEmpty());
		
		System.out.println("Espiando o topo da pilha " + pilha.peek());
		
		System.out.println("Desempilhando livros da pilha:");
		
		while(!pilha.isEmpty()) {
			System.out.println("desempilhando livro " + pilha.pop());
		}
		
		System.out.println("Todos os livros foram desempilhados " + pilha.isEmpty());
		

	}

}

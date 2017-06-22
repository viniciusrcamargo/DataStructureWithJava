package com.vinicius.datastructure.pilha.teste;

import java.util.Stack;

import com.vinicius.datastructure.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.isEmpty());//est� vazia
		System.out.println(stack.size());//tamanho
		System.out.println(stack);//ToString
		
		System.out.println(stack.peek());//espiar
		
		System.out.println("Desempilha "+stack.pop());
		
		System.out.println(stack);
		
		

	}

}
package com.vinicius.datastructure.pilha.labs;

import java.util.Scanner;
import com.vinicius.datastructure.pilha.Pilha;


public class Exer01 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for(int i = 1; i < 10; i++){
			System.out.println("Entre com um valor");
			num = scan.nextInt();
			
			if(num % 2 == 0){
				System.out.println("Empilhando o número " + num);
				pilha.empilha(num);
			}else{
				Integer desempilhado = pilha.desempilha();
				
				if(desempilhado == null){
					System.out.println("Pilha está vazia");
				}else{
					System.out.println("Número impar, desempilhando um número da pilha: " + desempilhado);
				}
			}
		}
			
		System.out.println("Todoa os números foram lidos, desempilhando os números");
		
		while(!pilha.estaVazia()){
			
				System.out.println("Desempilhando um número da pilha: " + pilha.desempilha());
			
		}
		
		System.out.println("Todos os elementos foram desempilhados");
	}

}

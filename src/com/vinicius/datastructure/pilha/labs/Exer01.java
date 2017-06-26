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
				System.out.println("Empilhando o n�mero " + num);
				pilha.empilha(num);
			}else{
				Integer desempilhado = pilha.desempilha();
				
				if(desempilhado == null){
					System.out.println("Pilha est� vazia");
				}else{
					System.out.println("N�mero impar, desempilhando um n�mero da pilha: " + desempilhado);
				}
			}
		}
			
		System.out.println("Todoa os n�meros foram lidos, desempilhando os n�meros");
		
		while(!pilha.estaVazia()){
			
				System.out.println("Desempilhando um n�mero da pilha: " + pilha.desempilha());
			
		}
		
		System.out.println("Todos os elementos foram desempilhados");
	}

}

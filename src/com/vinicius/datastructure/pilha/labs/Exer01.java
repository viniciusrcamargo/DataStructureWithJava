package com.vinicius.datastructure.pilha.labs;

import java.util.Scanner;
import com.vinicius.datastructure.pilha.Pilha;


public class Exer01 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for(int i = 0; i < 2; i++){
			System.out.println("Entre com o " + (i+1) + " valor");
			num = scan.nextInt();
			
			if(num % 2 == 0){
				pilha.empilha(num);
			}else{//verificar
				System.out.println("Desempilhando " + num);
				pilha.desempilha();
			}
		}
		
		
		
		System.out.println(pilha);
	}

}

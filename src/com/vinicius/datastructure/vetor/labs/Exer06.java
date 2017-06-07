package com.vinicius.datastructure.vetor.labs;

import java.util.Scanner;
import com.vinicius.datastructure.vetor.Lista;
import com.vinicius.datastructure.vetor.teste.Contato;

public class Exer06 {

	public static void main(String[] args) throws Exception {
		//cria��o de vari�veis
		Scanner scan = new Scanner(System.in);
		// criar vetor com 20 posi��es
		Lista<Contato> lista = new Lista<Contato>(20);
		//criar e adicionar 30 contatos
		criarContatosDinamicos(5, lista);
		
		//1 - Criar um menu para escolha de op��es
		int opc = 1;
		while(opc != 0){
			opc = obterOpcaoMenu(scan);
		}
		System.out.println("Usu�rio digitou 0 programa encerrado!");
	}
	
	private static int obterOpcaoMenu(Scanner scan){
		boolean entradaValida = false;
		int opc = 0;
		String entrada;
		
		while(!entradaValida){
		System.out.println("Informe a op��o desejada");
		System.out.println("1: Adiciona contato no final do vetor");
		System.out.println("2: Adiciona contato em uma posi��o espec�fica");
		System.out.println("3: Consulta contato de uma posi��o espec�fica");
		System.out.println("4: Contulta contato");
		System.out.println("5: Consulta �ltimo indice do contato");
		System.out.println("6: Verifica se contato existe");
		System.out.println("7: Excluir por posi��o");
		System.out.println("8: Excluir contato");
		System.out.println("9: Verifica tamanho do vetor");
		System.out.println("10: Excluir todos os contatos do vetor");
		System.out.println("11: Imprime o vetor");
		System.out.println("0: Sair");
		
		try{
			entrada = scan.nextLine();
			opc = Integer.parseInt(entrada);	
			
			if(opc >= 0 && opc <= 11){
			  entradaValida = true;	
			}else{
				throw new Exception();
			}
		}catch(Exception e){
			System.out.println("Entrada inv�lida digite novamente!\n\n");
		}
		
		}
		
		return opc;
	}
	private static void criarContatosDinamicos(int quantidade, Lista<Contato> lista) throws Exception{
		Contato contato;		
		for(int i = 1; i < quantidade; i++){
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("22222"+i);
			contato.setEmail("viniciius"+i+"@email.com");
			lista.adiciona(contato);
		}
	}

}

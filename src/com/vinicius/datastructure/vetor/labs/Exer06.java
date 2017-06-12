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
			
			switch (opc) {
			case 1:
				adicionarContato(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;

			default:
				break;
			}
		}
		System.out.println("Usu�rio digitou 0 programa encerrado!");
	}
	
	private static void adicionarContato(Scanner scan, Lista<Contato> lista) throws Exception{
		System.out.println("Criando um contato, entre com as informa��es");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o e-mail", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		lista.adiciona(contato);
		
		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}
	
	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) throws Exception{
		System.out.println("Criando um contato, entre com as informa��es");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o e-mail", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		int pos = leInformacaoInt("Entre com a posi��o a adicionar o contato",scan);
		
		try{
		lista.adiciona(contato);
		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
		}catch(Exception i){
			System.out.println("Posi��o inv�lida, contato n�o adicionado");
		}	
	}
	
	
	
	private static String leInformacao(String msg, Scanner scan){
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	
	private static int leInformacaoInt(String msg, Scanner scan){
		boolean entradaValida = false;
		int num = 0;
		
		while(!entradaValida){
		try{
		System.out.println(msg);
		String entrada = scan.nextLine();
		
		num = Integer.parseInt(entrada);
		entradaValida = true;
		}catch(Exception e){
			System.out.println("Entrada inv�lida");
		}
		}
		
		return num;
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

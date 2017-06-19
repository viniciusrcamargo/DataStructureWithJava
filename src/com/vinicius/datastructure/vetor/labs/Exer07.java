package com.vinicius.datastructure.vetor.labs;

import java.util.Scanner;
import java.util.ArrayList;
import com.vinicius.datastructure.vetor.teste.Contato;

public class Exer07 extends Exer06{

	public static void main(String[] args) throws Exception {
		//cria��o de vari�veis
		Scanner scan = new Scanner(System.in);
		// criar vetor com 20 posi��es
		ArrayList<Contato> ArrayList = new ArrayList<Contato>(20);
		//criar e adicionar 30 contatos
		criarContatosDinamicos(5, ArrayList);
		
		//1 - Criar um menu para escolha de op��es
		int opc = 1;
		while(opc != 0){
			opc = obterOpcaoMenu(scan);

			switch (opc) {
			case 1:
				adicionarContato(scan, ArrayList);
				break;
			case 2:
				adicionarContatoPosicao(scan, ArrayList);
				break;
			case 3:
				obtemContatoPosicao(scan, ArrayList);
				break;
			case 4:
				obtemContato(scan, ArrayList);
				break;
			case 5:
				pesquisarUltimoIndice(scan, ArrayList);
				break;
			case 6:
				pesquisarContatoExiste(scan, ArrayList);
				break;
			case 7:
				excluirPorPosicao(scan, ArrayList);
				break;
			case 8:
				excluirContato(scan, ArrayList);
				break;
			case 9:
				imprimeTamanhoVetor(ArrayList);
				break;
			case 10:
				limpaVetor(ArrayList);
				break;
			case 11:
				imprimeVetor(ArrayList);
				break;
			default:
				break;
			}
		}
		System.out.println("Usu�rio digitou 0 programa encerrado!");
	}
	
	private static void imprimeTamanhoVetor(ArrayList<Contato> ArrayList){
		System.out.println("O tamanho do vetor � " + ArrayList.size());
	}
	
	private static void limpaVetor(ArrayList<Contato> ArrayList){
		ArrayList.clear();
	}
	
	private static void imprimeVetor(ArrayList<Contato> ArrayList){
		ArrayList.toString();
	}
	
	private static void adicionarContato(Scanner scan, ArrayList<Contato> ArrayList) throws Exception{
		System.out.println("Criando um contato, entre com as informa��es");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o e-mail", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		ArrayList.add(contato);
		
		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
	}
	
	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> ArrayList) throws Exception{
		System.out.println("Criando um contato, entre com as informa��es");
		String nome = leInformacao("Entre com o nome", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o e-mail", scan);
		
		Contato contato = new Contato(nome, telefone, email);
		
		int pos = leInformacaoInt("Entre com a posi��o a adicionar o contato",scan);
		
		try{
		ArrayList.add(contato);
		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);
		}catch(Exception i){
			System.out.println("Posi��o inv�lida, contato n�o adicionado");
		}	
	}
	
	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> ArrayList){
		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try{
			Contato contato = (Contato) ArrayList.get(pos);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do �ltimo indice do contato encontrado");
			pos = ArrayList.lastIndexOf(contato);
			System.out.println("Contato encontrado na posi��o "+ pos);
		}catch(Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void pesquisarContatoExiste(Scanner scan, java.util.ArrayList<Contato> ArrayList){
		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try{
			Contato contato = (Contato) ArrayList.get(pos);
			
			boolean existe = ArrayList.contains(contato);
			
			if(existe){
				System.out.println("Contato existe, seguem dados: ");
				System.out.println(contato);
			}else{
				System.out.println("Contato n�o existe");
			}
		}catch(Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> ArrayList){
		int pos = leInformacaoInt("Entre com a posi��o a ser removida", scan);
		
		try{;
			ArrayList.remove(pos);
			System.out.println("Posi��o Excluida");
		}catch(Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void excluirContato(Scanner scan, ArrayList<Contato> ArrayList){
		int pos = leInformacaoInt("Entre com a posi��o a ser removida", scan);
		
		try{;
			Contato contato = (Contato) ArrayList.get(pos);
			ArrayList.remove(contato);
			System.out.println("Contato excluido");
		}catch(Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void obtemContato(Scanner scan, ArrayList<Contato> ArrayList){
		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try{
			Contato contato = (Contato) ArrayList.get(pos);
			System.out.println("Contato existe, seguem dados: ");
			System.out.println(contato);
			
			System.out.println("Fazendo pesquisa do contato encontrado");
			pos = ArrayList.indexOf(contato);
			System.out.println("Contato encontrado na posi��o "+ pos);
		}catch(Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> ArrayList){
		int pos = leInformacaoInt("Entre com a posi��o a ser pesquisada", scan);
		
		try{
			Contato contato = (Contato) ArrayList.get(pos);
			System.out.println(contato);
		}catch(Exception e){
			System.out.println("Posi��o inv�lida");
		}
	}
	
	
		
	
	private static void criarContatosDinamicos(int quantidade, ArrayList<Contato> ArrayList) throws Exception{
		Contato contato;		
		for(int i = 1; i < quantidade; i++){
			contato = new Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("22222"+i);
			contato.setEmail("viniciius"+i+"@email.com");
			ArrayList.add(contato);
		}
	}

}

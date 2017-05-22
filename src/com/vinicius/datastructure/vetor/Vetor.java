package com.vinicius.datastructure.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento){
		for(int i = 0; i < elemento.length(); i++){
			if(this.elementos[i] == null){
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	public void adiciona(String elemento) throws Exception{
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else{
			throw new Exception("Vetor j� est� cheio, n�o � poss�vel adicionais mais elementos");
		}
	}
	
	public boolean adiciona2(String elemento){
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public String busca(int posicao) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}
	//estrutura de busca sequencial
	public int busca(String elemento){
		for(int i = 0; i < this.tamanho; i++){
			if(this.elementos[i].equalsIgnoreCase(elemento)){
				return i;
			}
		}
		return -1;
	}
	
	
	
	public int tamanho(){
		return this.tamanho; 
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
	
		for(int i = 0; i < this.tamanho -1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0){
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append( "]");
		return s.toString();
	}
	
	
	
}

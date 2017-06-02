package com.vinicius.datastructure.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade){
		this.elementos = (T[])new Object[capacidade];
		this.tamanho = 0;
	}
	
	public Lista(int capacidade, Class<T> tipoClasse){
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}
		
	public void adiciona(T elemento) throws Exception{
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else{
			throw new Exception("Vetor já está cheio, não é possível adicionais mais elementos");
		}
	}
	
	public boolean adiciona2(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean contem(T elemento){
		/*int pos = busca(elemento);
		if(pos > -1){
			return true;
		}
		return false;*///mesma coisa que o source da rown de baixo
		return busca(elemento) > - 1;
	}
	//0 1 2 3 4 5 6 = tamanho é 5
	//B C E F G + +
	public boolean adiciona(int posicao, T elemento) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posição inválida");
		}		
		this.aumentaCapacidade();
		//mover todos os elementos para a próxima posição do array
		for(int i = this.tamanho-1; i >= posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	private void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i < this.tamanho; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posição inválida");
		}	
		for(int i = posicao; i < this.tamanho - 1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho++;
	}
	
	public void remove(T elemento) throws IllegalAccessException{
		int pos = this.busca(elemento);
		if(pos > -1){
			this.remove(pos);
		}
	}
	
	public Object busca(int posicao) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	//estrutura de busca sequencial
	public int busca(T elemento){
		for(int i = 0; i < this.tamanho; i++){
			if(this.elementos[i].equals(elemento)){
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
	
	public int ultimoIndice(T elemento){
		for(int i = this.tamanho-1; i >=0; i--){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
}

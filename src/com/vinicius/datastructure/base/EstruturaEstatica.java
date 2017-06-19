package com.vinicius.datastructure.base;

public class EstruturaEstatica<T> {
	
	private T[] elementos;
	private int tamanho;
	
	public EstruturaEstatica(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica(){
		this(10);
	}
	
	protected boolean adiciona2(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	protected boolean adiciona(int posicao, T elemento) throws IllegalAccessException{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalAccessException("Posi��o inv�lida");
		}		
		this.aumentaCapacidade();
		//mover todos os elementos para a pr�xima posi��o do array
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

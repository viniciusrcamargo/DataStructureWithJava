package com.vinicius.datastructure.pilha;

import com.vinicius.datastructure.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha(){
		super();
	}
	
	public Pilha(int capacidade){
		super(capacidade);
	}
	
	public void empilha(T elemento){
		super.adiciona2(elemento);
	}
	
	public T topo(){
		if(this.estaVazia()){
			return null;
		}
		return this.elementos[tamanho-1];
	}
}

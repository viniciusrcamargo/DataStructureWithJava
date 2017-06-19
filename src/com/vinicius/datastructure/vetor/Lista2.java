package com.vinicius.datastructure.vetor;

import com.vinicius.datastructure.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

	public Lista2(){
		super();
	}
	
	public Lista2(int capacidade){
		super(capacidade);
	}
	
	public boolean adiciona2(T elemento){
		return super.adiciona2(elemento);
	}
	
	public boolean adiciona(int posicao, T elemento) throws IllegalAccessException{
		return super.adiciona(posicao, elemento);
	}
	
}

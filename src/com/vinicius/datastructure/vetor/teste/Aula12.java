package com.vinicius.datastructure.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(3, "JK");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("B");
		if(existe){
			System.out.println("Elemento existe");
		}else{
			System.out.println("Elemento não existe");
		}
		
		int pos = arrayList.indexOf("E");
		if(pos > -1){
			System.out.println("Elemento existe " + pos);
		}else{
			System.out.println("Elemento não existe " + pos);
		}
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(2);
		
		System.out.println(arrayList);

	}

}

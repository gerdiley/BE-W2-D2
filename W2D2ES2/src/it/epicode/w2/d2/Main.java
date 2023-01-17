package it.epicode.w2.d2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = generaLista(10);
		
		stampaLista(lista);
		stampaPariDispari(lista, true);
		
		
		
		
		
	}

	public static ArrayList<Integer> generaLista(int n){
		
		Random r =  new Random();
			
		ArrayList<Integer> lista = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			lista.add(r.nextInt(100));
		}
		
		System.out.printf("Lista iniziale: %n" + lista.toString() + "%n");
		return lista;
	}
	
	public static void stampaLista(ArrayList<Integer> lista) {
		Collections.sort(lista);
		System.out.println("Lista crescente: ");
		System.out.println(lista);
		
		Collections.reverse(lista);
		System.out.println("Lista decrescente: ");
		System.out.println(lista);
	}
	
	public static void stampaPariDispari(ArrayList<Integer> lista, boolean b) {
		
		ArrayList<Integer> listaPari =  new ArrayList<>();
		ArrayList<Integer> listaDispari =  new ArrayList<>();
		
		
		if (b) {
			
			for(int i = 0; i< lista.size(); i++) {
				if (i % 2 == 0) {
					listaPari.add(lista.get(i));
				}
			}
			System.out.println(listaPari);
		} else {
			for(int i = 0; i< lista.size(); i++) {
				if (i % 2 != 0) {
					listaDispari.add(lista.get(i));
				}
				
			}
			System.out.println(listaDispari);
			
		}
		
	};
	
	
	
}

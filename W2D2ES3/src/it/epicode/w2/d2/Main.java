package it.epicode.w2.d2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static HashMap<String, String> rubrica = new HashMap<String, String>();
	public static void main(String[] args) throws Exception {
		
		
		rubrica.put("Gerardo", "3274942733");
		rubrica.put("Angelo", "3234524525");
		rubrica.put("Serena", "323456533");
		rubrica.put("Sebastiano", "3223455463");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il nome del nuovo contatto: ");
		String name = in.nextLine();
		
		System.out.println("Inserisci il numero del nuovo contatto: ");
		String number = in.nextLine();		
		
	
		inserimento(name , number);

		System.out.println("Inserisci il nome del contatto che vuoi cancellare: ");
		name = in.nextLine();
		
		cancellaNome(name);
		
		System.out.println("Inserisci il numero del contatto che vuoi cercare");
		number = in.nextLine();
		
		ricercaPerNumero(number);
		
		System.out.println("Inserisci il nome del contatto che vuoi cancellare: ");
		name = in.nextLine();
		
		ricercaPerNome(name);

		
		stampaContatti();
		
	}
	

//	inserimento
	public static void inserimento(String nome, String telefono) throws Exception{


		if (rubrica.containsKey(nome)) {
			throw new Exception("Contatto gia esistente");
		} else
		rubrica.put(nome, telefono);
		
		System.out.println("Nuova lista contatti: ");

		for (String cur : rubrica.keySet()) {
			System.out.println("Nome: " + cur + " N. di cellulare: " + rubrica.get(cur));

		}
	}
//	cancellazione a partire dal nome
	
	public static void cancellaNome(String nome) {
		rubrica.remove(nome);
		
		System.out.println("Nuova lista contatti: ");
		
		for (String cur : rubrica.keySet()) {
			System.out.println("Nome: " + cur + " N. di cellulare: " + rubrica.get(cur));

		}
	}
//	ricerca persona da n. telefono
	
	public static void ricercaPerNumero(String num) {
		 String trovato = null;
		 for(String cur : rubrica.keySet()) {
			 if (num.equals(rubrica.get(cur))) {
				 trovato = cur;
			 }
		 }
		 System.out.println("IL numero cercato e` di " + trovato);
	 }
//	ricerca persona da nome
	
	public static void ricercaPerNome(String nome) {
		System.out.println("Il numero di " + nome + " e`" + rubrica.get(nome));
		}
	
// stampa contatti

		private static void stampaContatti() {
			System.out.println("Rubrica: ");

			for (String cur : rubrica.keySet()) {
				System.out.println("Nome: " + cur + " N. di cellulare: " + rubrica.get(cur));

			}
		}

	}

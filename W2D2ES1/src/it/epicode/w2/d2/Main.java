package it.epicode.w2.d2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il numero di elementi da inserire");
		int n = Integer.parseInt(in.nextLine());
		
		Set<String> setParole = new HashSet<>();
		
		int c = 0;
		for (int i = 0; i < n; i++) {
			
			System.out.println("Inserisci la parola n." + (i+1));
			
			String s = in.nextLine();
			
			if (setParole.contains(s)) {
				c++;
			} 
			
			setParole.add(s);	
			
		}
		
		System.out.println("N. Parole duplicate: " + c);
		System.out.println("N. Parole distinte:  " + setParole.size());
		System.out.println("Parole distinte: " + setParole);
		
	}

}

package org.java;

import java.util.Scanner;

public class Carrello {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	

	 boolean nuovoProdotto = true;
	while (nuovoProdotto) {
		Prodotto[] prodotti = new Prodotto[25];
		System.out.println("Vuoi inserire un prodotto ?");
		
		String risposta = in.nextLine().toLowerCase();
		if (risposta.equals("no")) {
			nuovoProdotto=false; 
			break; 
		}else if (!risposta.equals("si")) {
			System.out.println("**Rispondimi soltanto si o no**");
			continue;
		}
		
		System.out.println("Quale tipo di prodotto vuoi inserire? (Smartphone, Televisore , Cuffie)");
		String inputProdotto = in.nextLine().toLowerCase();
		
	
			if (!inputProdotto.equals("smartphone") || !inputProdotto.equals("televisore") || !inputProdotto.equals("cuffie")) {
				System.out.println("**Rispondimi soltanto Smartphone, Televisore o Cuffie**");
				continue;
			}
		
		
		String nome; 
		String descrizione; 
		float prezzoBase;
		float IVA;
		String codiceIMEI;
		int memoria;
		int dimensioni;
		boolean smartTV;
		String colore;
		boolean wireless;
		
		System.out.println("come si chiama il prodotto ?");
		nome = in.nextLine();
		System.out.println("Scrivi una piccola descrizione ?");
		descrizione = in.nextLine();
		System.out.println("Qual è il prezzo?");
		prezzoBase = in.nextFloat();
		System.out.println("Quanto è l'IVA  da applicare su questo prodotto?");
		IVA = in.nextFloat();
		
		if(inputProdotto.equals("smartphone")) {
			System.out.println("iphone");
		} else if (inputProdotto.equals("televisore")) {
			System.out.println("TV");
		} else  {
			System.out.println("Bose");
		} 
		
		
		
	}
	
	

	
	
	
	
	
}
}

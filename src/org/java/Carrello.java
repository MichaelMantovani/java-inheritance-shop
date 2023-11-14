package org.java;

import java.util.Scanner;

public class Carrello {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	Prodotto[] prodotti = new Prodotto[25];

	 boolean nuovoProdotto = true;
	while (nuovoProdotto) {
		System.out.println("Vuoi inserire un prodotto ?");
		String risposta = in.nextLine().toLowerCase();
		if (risposta.equals("no")) {
			nuovoProdotto=false; 
			break; 
		}else if (!risposta.equals("si") && !risposta.equals("no")) {
			System.out.println("**Rispondimi soltanto si o no**");
			continue;
		} else {

			System.out.println("Quale tipo di prodotto vuoi inserire? (Smartphone, Televisore , Cuffie)");
			String inputProdotto = in.nextLine().toLowerCase();
			
		
				if (!inputProdotto.equals("smartphone") && !inputProdotto.equals("televisore") && !inputProdotto.equals("cuffie")) {
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
			String smartTV;
			String colore;
			String wireless;
			
			System.out.println("come si chiama il prodotto ?");
			nome = in.nextLine();
			System.out.println("Scrivi una piccola descrizione ?");
			descrizione = in.nextLine();
			System.out.println("Qual è il prezzo?");
			prezzoBase = in.nextFloat();
			System.out.println("Quanto è l'IVA  da applicare su questo prodotto?");
			IVA = in.nextFloat();
			
			if(inputProdotto.equals("smartphone")) {
				System.out.println("Qual è il suo codice IMEI ?");
				codiceIMEI = in.nextLine();
				in.nextLine(); 
				System.out.println("Quanto memoria ha ?");
				memoria = Integer.valueOf(in.nextLine());
			} else if (inputProdotto.equals("televisore")) {
				System.out.println("Quanti pollici è?");
				dimensioni = in.nextInt();
				in.nextLine(); 
				System.out.println("É una smart ?");
				smartTV = in.nextLine();
			} else  {
				System.out.println("Di che colore sono?");
				colore = in.nextLine();
				in.nextLine(); 
				System.out.println("Sono wireless o cablate ?");
				wireless = in.nextLine();
			} 
		}
		
		
		
		
	}
	
	

	
	
	
	
	
}
}

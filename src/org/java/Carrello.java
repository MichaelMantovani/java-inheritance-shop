package org.java;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	Prodotto[] prodotti = new Prodotto[25];
	int prodotti_length = prodotti.length - prodotti.length;
	 boolean nuovoProdotto = true;
	while (nuovoProdotto) {
		System.out.println("Vuoi inserire un prodotto ?");
		String risposta = in.nextLine().toLowerCase().trim();
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
				System.out.println("Qual è il suo codice IMEI ?");
				codiceIMEI = in.next();
				in.nextLine();
				System.out.println("Quanto memoria ha ?");
				memoria = Integer.valueOf(in.nextLine());
				
				prodotti[prodotti_length] = new Smartphone(nome, descrizione, prezzoBase, IVA, codiceIMEI, memoria);
				prodotti_length++;
				
			} else if (inputProdotto.equals("televisore")) {
				System.out.println("Quanti pollici è?");
				dimensioni = in.nextInt();
				in.nextLine();
				System.out.println("É una smart ?");
				smartTV = in.nextLine().toLowerCase().equals("si")? true : false ;
				
				prodotti[prodotti_length] = new Televisore(nome, descrizione, prezzoBase, IVA, dimensioni, smartTV);
				prodotti_length++;
				
			} else  {
				System.out.println("Di che colore sono?");
				colore = in.next(); 
				in.nextLine();
				System.out.println("Sono wireless o cablate ?");
				wireless = in.nextLine().toLowerCase().equals("wireless") ? true : false;
				
				prodotti[prodotti_length] = new Cuffie(nome, descrizione, prezzoBase, IVA, colore, wireless);
				prodotti_length++;
			} 
		}
		
	}
	
	if (prodotti[0] != null)
	System.out.println(Arrays.asList(prodotti));
	
	
	

	
	
	
	
	
}
}

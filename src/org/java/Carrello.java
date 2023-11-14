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
			System.out.println("Rispondimi soltanto si o no");
			continue;
		}
		
		System.out.println("Quale tipo di prodotto vuoi inserire? (Smartphone, Televisore , Cuffie)");
		String inputProdotto = in.nextLine();
		System.out.println(inputProdotto);
	}
	
	

	
	
	
	
	
}
}

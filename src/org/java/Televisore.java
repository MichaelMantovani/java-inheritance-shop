package org.java;

public class Televisore extends Prodotto {
	
	private int dimensioni;
	private boolean smartTV;
	
	
	public Televisore(String nome, String descrizione, float prezzo, float IVA,int dimensioni,boolean smartTV) {
		super(nome, descrizione , prezzo , IVA);
		setDimensioni(dimensioni);
		setSmartTV(smartTV);
	}


	public int getDimensioni() {
		return dimensioni;
	}


	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}


	public boolean isSmartTV() {
		return smartTV;
	}


	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
		
	@Override
	public String toString() {
		
		return super.toString() + "\n"
				+ "Dimensione della tv: " + getDimensioni() + " pollici" + "\n" 
				+ "Caratteristiche: " + (isSmartTV() ? "Smart TV" : "La TV non è smart");
	}
	
	}


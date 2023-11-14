package org.java;

public class Cuffie extends Prodotto {
	
	private String colore;
	private boolean wireless;
	
	public Cuffie(String nome, String descrizione, float prezzo, float IVA, boolean tessera, String colore, boolean wireless) {
		super(nome, descrizione , prezzo , IVA, tessera);
		setColore(colore);
		setWireless(wireless);
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	public float getPrezzoScontato() {
		float prezzoScontato = super.getPrezzoScontato();
		if(!this.wireless) prezzoScontato = super.getPrezzo() - (super.getPrezzo() * 7 / 100);
		return prezzoScontato;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\n"
				+ "Colore: " + getColore() + "\n"
				+ "Caratteristiche: " + (isWireless() ? "Wireless" : "Cablate")+ "\n"
				+ "--------------------------------------";
				
	}
	
	
}

package org.java;

public class Smartphone extends Prodotto{
	
	private String codiceIMEI;
	private int memoria;
	
	
	public Smartphone(String nome, String descrizione, float prezzo, float IVA, String  codiceIMEI , int memoria) {
		super(nome, descrizione , prezzo , IVA);
		setCodiceIMEI(codiceIMEI);
		setMemoria(memoria);
		
	}


	public String getCodiceIMEI() {
		return codiceIMEI;
	}


	public void setCodiceIMEI(String codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}


	public int getMemoria() {
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Codice IMEI: " + getCodiceIMEI() + "\n" 
				+ "Memoria del telefono: " + getMemoria()  + "GB";
	}
	
	
}

package org.java;

public class Smartphone extends Prodotto{
	
	private String codiceIMEI;
	private int memoria;
	
	
	public Smartphone(String nome, String descrizione, float prezzo, float IVA,boolean tessera, String  codiceIMEI , int memoria) {
		super(nome, descrizione , prezzo , IVA , tessera);
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
	
	public float getPrezzoScontato() {
		float prezzoScontato = super.getPrezzo();
		if(this.memoria < 32) prezzoScontato = super.getPrezzo() - (super.getPrezzo() * 5 / 100);
		return prezzoScontato;
	}
	@Override
	public String toString() {
		return super.toString() + "\n"
				+ "Codice IMEI: " + getCodiceIMEI() + "\n" 
				+ "Memoria del telefono: " + getMemoria()  + "GB" + "\n"
				+ "--------------------------------------";
	}
	
	
}

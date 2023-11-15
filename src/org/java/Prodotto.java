package org.java;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private float IVA;
	private boolean tessera;

//	Costruttore
	public Prodotto(String nome, String descrizione, float prezzo, float IVA, boolean tessera) {
		setCodice(codice);
		setNome(nome);
		setDescrizione(descrizione);
		setPrezzoBase(prezzo);
		setIVA(IVA);
		setTessera(tessera);
	}

//	Getter e setter per il codice
	private void setCodice(int codice) {
		Random rdn = new Random();
		this.codice = rdn.nextInt(1000000);
	}

	public int getCodice() {
		return this.codice;
	}

//	Getter per formattare il codice
	public String getCodiceCompleto() {
		return String.format("%08d", this.codice);
	}

//	Getter e setter per il nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

//	Getter per combinare codice e nome 
	public String getCodiceNome() {
		return this.codice + "-" + this.nome;
	}

//	Getter e setter per la descrizione
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

//	Getter e setter per il prezzo senza IVA
	public void setPrezzoBase(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getPrezzoBase() {
		return this.prezzo;
	}

//	Getter e setter per l'IVA
	public void setIVA(float IVA) {
		this.IVA = IVA;
	}

	public float getIVA() {
		return this.IVA;
	}

//	Getter per il prezzo con aggiunta di IVA
	public float getPrezzo() {
		return this.prezzo + this.prezzo * (this.IVA / 100);
	}

//	Setter della tessera fedeltà
	public void setTessera(boolean tessera) {
		this.tessera = tessera;
	}

//	Getter per la tessera fedeltà
	public boolean hasTessera() {
		return tessera;
	}

//	Getter del prezzo in caso di tessera fedeltà
	public float getPrezzoScontato() {
		float prezzoScontato = getPrezzo();
		if (this.tessera)
			prezzoScontato = getPrezzo() - (getPrezzo() * 2 / 100);
		return prezzoScontato;
	}

//	Metodo per stampare in modo leggibile l'istanza dell'oggetto
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prodotto:\n" + "Codice: " + getCodice() + "\n" + "Nome: " + getNome() + "\n" + "Codice completo: "
				+ getCodiceCompleto() + "\n" + "Codice-Nome : " + getCodiceNome() + "\n" + "Descrizione: "
				+ getDescrizione() + "\n" + "Prezzo: € " + String.format("%.2f", getPrezzoScontato());
	}
}

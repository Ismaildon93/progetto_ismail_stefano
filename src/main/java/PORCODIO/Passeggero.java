package PORCODIO;

import java.util.ArrayList;
import java.util.List;

import vehicle.Pulman;

public class Passeggero {
	
	private String nome;
	private String cognome;
	private List<Pulman> pulmans;
	
	public Passeggero(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.pulmans = new ArrayList<Pulman>();
	}
	
	public void addPulman(Pulman pulman) {
		pulmans.add(pulman);
	}
	
	public List<Pulman> getPulmans() {
		return pulmans;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
}

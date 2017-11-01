package vehicle;
import java.util.ArrayList;
import java.util.List;

import PORCODIO.*;

public class Pulman extends Veicolo {

	private String societa;
	private int numPosti;
	private List<Passeggero> passeggeri;
	
	public Pulman(String societa, int numPosti, String targa, String numTelaio, 
						int cilindrata, int pistoni){
		
		super(targa, numTelaio, cilindrata, pistoni);
		this.societa = societa;
		this.numPosti = numPosti;
		this.passeggeri = new ArrayList<Passeggero>();
		
	}
	
	public int addPasseggero(Passeggero passeggero){
		
		passeggeri.add(passeggero);
		
		return passeggeri.size();
	}
	
	public String getSocieta(){
		return societa;
	}
	
	public int getNumPosti(){
		return numPosti;
	}
}

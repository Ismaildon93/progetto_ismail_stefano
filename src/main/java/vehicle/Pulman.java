package vehicle;


public class Pulman extends Veicolo {

	private String societa;
	private int numPosti;
	
	public Pulman(String societa, int numPosti, String targa, String numTelaio, 
						int cilindrata, int pistoni){
		
		super(targa, numTelaio, cilindrata, pistoni);
		this.societa = societa;
		this.numPosti = numPosti;
		
	}
	
	public String getSocieta(){
		return societa;
	}
	
	public int getNumPosti(){
		return numPosti;
	}
}

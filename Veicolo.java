public abstract class Veicolo {

	private String targa;
	private String numTelaio;
	private Motore motore;
	
	public Veicolo(String targa, String numTelaio, int cilindrata, int pistoni) {
		this.targa = targa;
		this.numTelaio = numTelaio;
		this.motore = new Motore(cilindrata, pistoni);
	}
	
	public String getTarga(){
		
		return targa;
	}
	
	public String getNumTelaio(){
		
		return numTelaio;
	}
	
	public Motore getMotore(){
		
		return motore;
		
	}
	
}

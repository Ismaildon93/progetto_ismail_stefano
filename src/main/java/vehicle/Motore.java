package vehicle;


public class Motore {

	private int cilindrata;
	private int pistoni;

	protected Motore(int cilindrata, int pistoni) {
		this.cilindrata = cilindrata;
		this.pistoni = pistoni;
	}
	
	public int getCilindrata(){
		return cilindrata;
	}
	
	public int getPistoni(){
		return pistoni;
	}
}

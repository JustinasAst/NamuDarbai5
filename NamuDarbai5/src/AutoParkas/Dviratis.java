package AutoParkas;

public class Dviratis extends TransportoPriemone {
	int pavaros;
	public Dviratis(int ratuSkaicius, String nezinoma) {
		super(ratuSkaicius, nezinoma);
		
	}
	
	
	public Dviratis(int pavaros, int ratuSkaicius, String nezinoma) {
		super(ratuSkaicius, nezinoma);
		this.pavaros = pavaros;
		
	}
	public int getPavaros() {
		return pavaros;
	}
	
	public void info2() {
		System.out.println("Dviratis");
		System.out.println("Pavaros: " + this.pavaros);
		
	}

}

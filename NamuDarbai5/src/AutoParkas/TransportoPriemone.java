package AutoParkas;

public class TransportoPriemone {
//	public TransportoPriemone() {
//		
//	}
	int ratuSkaicius;
	String spalva;
	
	public TransportoPriemone(int ratuSkaicius, String nezinoma) {
		this.ratuSkaicius = 0;
		this.spalva = nezinoma;
	}
	public int getRatuSk() {
		return ratuSkaicius;
	}
	public String getSpalva() {
		return spalva;
	}

	public void spausdinti() {
		System.out.println("Ratu skaicius: " + this.ratuSkaicius + " Spalva: " + this.spalva);

	}

}

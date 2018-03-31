package AutoParkas;

public class Automobilis extends TransportoPriemone {

	private KuroTipas kuroTipas;
	private int variklioTuris;
	private int cilindruSkaicius;

	public Automobilis(int ratuSkaicius, String nezinoma, KuroTipas kuroTipas, int variklioTuris, int cilindruSkaicius) {
		super(ratuSkaicius, nezinoma);
		this.kuroTipas = kuroTipas;
		this.variklioTuris = variklioTuris;
		this.cilindruSkaicius = cilindruSkaicius;

	}

	enum KuroTipas {

		E95("Devym penktas", 95), E98("Devym astuntas", 98);

		String obj;
		int okt;

		KuroTipas(String obj, int okt) {
			this.obj = obj;
			this.okt = okt;

		}

		public String gautiObj() {
			return obj;
		}

		public int getOkt() {
			return okt;
		}

	}

	public void info1() {
		System.out.println("Variklio turis: " + variklioTuris + ", Cilindu: " + cilindruSkaicius);
		System.out.println("Kuro tipas: " + this.kuroTipas.gautiObj() + " " + this.kuroTipas.getOkt());
		// for(Automobilis KT: Automobilis.values()) {
		// System.out.println("Automobilis");
		// System.out.printf("%s\t%s", KT, KT.gautiObj(), KT.gautiSkaitineReiksme());
		//
		// }

	}

}

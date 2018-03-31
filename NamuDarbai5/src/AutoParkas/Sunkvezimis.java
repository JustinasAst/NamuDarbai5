package AutoParkas;

public class Sunkvezimis extends Automobilis {
	int svoris;
	int galia;
	public Sunkvezimis(int ratuSkaicius, String nezinoma, KuroTipas kuroTipas, int variklioTuris, int cilindruSkaicius) {
		super(ratuSkaicius, nezinoma, kuroTipas, variklioTuris, cilindruSkaicius);
		
	}

	
	public Sunkvezimis(int ratuSkaicius, String nezinoma, KuroTipas kuroTipas, int variklioTuris, int cilindruSkaicius, int svoris, int galia) {
		super(ratuSkaicius, nezinoma, kuroTipas, variklioTuris, cilindruSkaicius);
		this.svoris = svoris;
		this.galia = galia;
		
	}
	public int getSvoris() {
		return svoris;
	}
	public int getGalia() {
		return galia;
	}

	public void info3() {
		System.out.println("Sunkvezimis");
		System.out.println("Svoris: " + this.svoris + " kg, " + " Galia: " + this.galia + " kw");
		
	}

}

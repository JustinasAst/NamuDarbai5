package AutoParkas;

import AutoParkas.Automobilis.KuroTipas;

public class Uzduotis1 {
	public static void main(String[] args) {
		TransportoPriemone tp = new TransportoPriemone(0, "nezinoma");
		Automobilis auto = new Automobilis(0, null, Automobilis.KuroTipas.E95, 5, 8);
		auto.info1();
		Dviratis dv = new Dviratis(0, 0, "");
		dv.info2();
		Sunkvezimis sunk = new Sunkvezimis(0, "", KuroTipas.E95, 12, 8, 1200, 420);
		sunk.info3();
		tp.spausdinti() ;
	}

}

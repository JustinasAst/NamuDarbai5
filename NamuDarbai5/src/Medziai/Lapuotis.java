package Medziai;

public class Lapuotis extends Medziai {

	public Lapuotis(int metai, int litrai) {
		super(metai, litrai);
	}
	public void laikasKirsti() {
		if(metai >= 10 && litrai >= 2500) {
			//System.out.println("Galima kirsti lapuoti");
		}else {
			//System.out.println("Negalima kirsti medziu");
		}
			
		}

}
package Medziai;

public class Pusis extends Medziai{

	public Pusis(int metai, int litrai) {
		super(metai, litrai);
		this.metai=9;
		this.litrai = 2500;
	}
	public void laikasKirsti() {
		if(metai>=8 ) {
			System.out.println("Galima kirsti Pusis");
		}else {
			System.out.println("Negalima kirsti Pusies");
		}
	}
	public void informacija () {
		System.out.println("Pusis metai: " + this.metai + "."+" Suvartotas vanduo: " + this.litrai + " litrai " +"."+ "Galima kirsti po 8 metu");
	}
}

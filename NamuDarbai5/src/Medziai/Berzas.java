package Medziai;

public class Berzas extends Medziai {

	public Berzas(int metai, int litrai) {
		super(metai, litrai);
		this.metai = 8;
		this.litrai = 2500;
	}
	public void laikasKirsti() {
		if(metai >= 10 && litrai >= 2500) {
			System.out.println("Galima kirsti Berza");
		}else {
			System.out.println("Negalima kirsti Berzo");
		}
			
		}
	public void informacija () {
		System.out.println("Berzas metai: " + this.metai + "."+" Suvartotas vanduo: " + this.litrai + " litrai " +"."+ "Galima kirsti po 10 metu");
	}
}

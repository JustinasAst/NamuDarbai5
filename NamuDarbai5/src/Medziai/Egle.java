package Medziai;

public class Egle extends Medziai {

	public Egle(int metai, int litrai) {
		super(metai, litrai);
		this.metai = 7;
		this.litrai = 2000;
	}
	public void laikasKirsti() {
		if(metai>=8 ) {
			System.out.println("Galima kirsti Egle");
		}else {
			System.out.println("Negalima kirsti Egle");
		}

}
	public void informacija () {
		System.out.println("Egle metai: " + this.metai + "."+" Suvartotas vanduo: " + this.litrai + " litrai " +"."+ "Galima kirsti po 8 metu");
	}
}

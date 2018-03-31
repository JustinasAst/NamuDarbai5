package Medziai;

public class Azuolas extends Medziai {

	public Azuolas(int metai, int litrai) {
		super(metai, litrai);
		this.metai =21;
		this.litrai = 4000;
	}
	
	public void laikasKirsti() {
		if(metai >= 20 && litrai >= 2500) {
			System.out.println("Galima kirsti Azuolas");
		}else {
			System.out.println("Negalima kirsti Azuolas");
		}
			
		}
	public void informacija () {
		System.out.println("Azuolas metai: " + this.metai +"."+ " Suvartotas vanduo: " + this.litrai + " litrai " +"."+ "Galima kirsti po 20 metu");
	}
}

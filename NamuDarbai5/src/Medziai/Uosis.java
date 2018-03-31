package Medziai;

public class Uosis extends Medziai {

	public Uosis(int metai, int litrai) {
		super(metai, litrai);
		this.metai = 10;
		this.litrai = 2500;
		
	}
	public void laikasKirsti() {
		if(metai >= 10 && litrai >= 2500) {
			System.out.println("Galima kirsti Uosi");
		}else {
			System.out.println("Negalima kirsti Uosio");
		}
			
				
			
		}
	public void informacija () {
		System.out.println("Uosio metai: " + this.metai +"."+ " Suvartotas vanduo: " + this.litrai + " litrai " +"."+ "Galima kirsti po 10 metu");
	}

}

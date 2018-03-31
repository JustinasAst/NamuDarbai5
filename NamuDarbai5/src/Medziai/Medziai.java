package Medziai;

public class Medziai {
	int metai;
	int litrai;
	public Medziai(int metai, int litrai) {
		this.metai = metai;
		this.litrai = litrai;
		
	}

	public void auginti() {
		
		
		
		
	}

	public void laistyti() {
		if(litrai > 2000) {
			//System.out.println("Kirsti galima");
		}else {
			//System.out.println("Kirsti negalima");
		}
		
		
	}

	public void laikasKirsti() {
		if(metai >= 10) {
			//System.out.println("Galima kirsti lapuoti");
		}else if(metai>=8 ) {
			//System.out.println("Galima kirsti spygliuoti");
		}else {
			//System.out.println("Negalima kirsti medziu");
		}
		
	}

	
	public void informacija() {
		
		
	}
	 

}

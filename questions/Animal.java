package questions;

public class Animal {
	int nofLegs;
	String name;
	Boolean Wings;
	
	Animal(String name, int nofLegs, Boolean Wings){
		this.name = name;
		this.nofLegs = nofLegs;
		this.Wings = Wings;
		
	}
	public void canfly() {
		if(this.Wings == true ) {
			System.out.println("Can fly");
		}else {System.out.println("No wings!!!");}
	}

}

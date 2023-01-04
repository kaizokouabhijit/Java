package Nestedclasses;

public class Anonymousnested {
	
	public void display() {
	
		System.out.println("Outer class display method");
	}
	public static void main(String [] args) {
		
		Anonymousnested b = new Anonymousnested();
		Anonymousnested a = new Anonymousnested() {
			public void display() {// Anonymous class object created here runs the display method of the inner  class			
				super.display();   // this will overload the display method and run the method from outer class
				System.out.println("Anonymous class display method");
			}
		};
		a.display();
		b.display();
	}

}

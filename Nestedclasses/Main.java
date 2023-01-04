package Nestedclasses;

public class Main {
	int model = 5;
	public class inner{
		
		int key = 6;
		public void display() {
			System.out.println("Key pressed " +model);
		}
	}
	
	public static void main(String [] args) {
		Main l = new Main();
		Main.inner k = l.new inner();
		k.display();
		System.out.println((k.key));
		
	}

}

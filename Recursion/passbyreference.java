package Recursion;

public class passbyreference {
	int id;
	public static void  xyz(passbyreference y) {
		y.id = 10;
	}
	public static void main(String [] args) {
		passbyreference a = new passbyreference();
		
		a.id = 5;
		System.out.println(a.id);
		xyz(a);
		System.out.println(a.id);
	}

}

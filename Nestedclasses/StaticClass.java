package Nestedclasses;

public class StaticClass {
	void display() {
		System.out.println("Inside outer class");
	}
	static class inner{
		//static class inner extends StaticClass() --- if we do this, then we can override the display method using super.method()
		static int model = 5;
		void display() {
			
			System.out.println("Inside inner static class");
		}
	}
	public static void main(String [] args) {
		
		inner i = new inner();
		
		StaticClass.inner s = new StaticClass.inner();
		s.display();
		System.out.println(i.model);
		i.display(); // in order to use the display method of the outer class here, we have to first extend that to the inner class and then use super.method() in the method of the inner class
		
	}
}

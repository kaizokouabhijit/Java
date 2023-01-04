package Nestedclasses;

public class Localnested {

	void xyz() {
		System.out.println("XYZ method");
		class localinner{
			void abc() {
				System.out.println("abc method");
			}
		}
		localinner l = new localinner();
		l.abc();
	}
	public static void main(String [] args) {
		Localnested n = new Localnested();
		n.xyz();
		
		
	}
}

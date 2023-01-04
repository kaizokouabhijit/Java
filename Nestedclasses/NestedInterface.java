package Nestedclasses;

interface old{
	void xyz();
	interface New{
		void abc();
	}
}

public class NestedInterface implements old.New{  
	// if we want to override the outer interface method xyz(), then we write class implements old.
	//to override the inner interface method abc(), we need to write class implement old.New
	
// if it's outer class - inner interface, everything remains the same, only the outer class methods need to have a body
	
	@Override
	public void abc() {
		System.out.println("Inside old interface method");
		
	}
	public static void main(String [] args) {
		NestedInterface n = new NestedInterface();
		n.abc();
	//	n.xyz();
	}

}

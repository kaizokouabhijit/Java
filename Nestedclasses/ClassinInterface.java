package Nestedclasses;

interface shop{
	void buylaptop(Laptop l);
	void buylaptop();

	// if we instantiate the laptop class, then we can pass that object in this buyLaptop method.
	
	class Laptop{
		
		int model;
		String manufacturer;
		
		Laptop(int model, String manufacturer){
			this.model = model;
			this.manufacturer = manufacturer;
		}
		
		void xyz() {
			System.out.println("inside xyz method");
		}
	}
	
}
// purpose of a class inside interface is that in the method of the interface, we can pass the object of the inner class as parameter.

public class ClassinInterface implements shop{

	@Override
	public void buylaptop() {
		System.out.println("body of this method in ");
		
		
	}
	ClassinInterface c = new ClassinInterface();
	@Override
	public void buylaptop(Laptop l) {
		System.out.println(l.manufacturer);
		System.out.println(l.model);
		
	}
	public static void main(String [] args) {
		ClassinInterface c = new ClassinInterface();
		c.buylaptop(new Laptop(35, "HP"));// buy laptop method is initialised in the class Laptop, so we need to create an object of Laptop class and then pass the parameters
	}
	

	

}

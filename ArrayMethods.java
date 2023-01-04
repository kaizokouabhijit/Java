package assignment;
import java.util.*;

public class ArrayMethods {

	public static void main(String [] args) {
		int [] arr1 = {12,34, 56, 76, 89, 97};
		int [] arr2 = {12, 34, 56, 76, 89, 97};
		int [] arr3 = arr1;
		int [] arr4 = new int[5];
		// equals method prints true if both arrays point to the same location
		
		System.out.println(arr1.equals(arr3));
		System.out.println(arr1.equals(arr2));
		System.out.println(arr1.getClass()); // getClass() returns the runtime class of the method
		System.out.println(arr1.hashCode());// hashCode() returns the hash code value for the object.
		System.out.println(arr2.hashCode());// hash code value is unique
		System.out.println(arr1.toString());// toString() method returns a string representation of object
		System.out.println(arr1.length); //length method returns number of elements in the array
		arr4 = arr1.clone(); // creates a clone of an array
		for(int i:arr4) {
			System.out.print(++i + " ");  // incrementing every element by 1 to prove its arr4 is different from arr1
		}
		
		
	}
}

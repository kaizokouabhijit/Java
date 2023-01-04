package questions;
import java.util.Scanner;


public class removeduplicate {
	
	public static void removeDuplicates(int[] array, int size) {
        int[] temp = new int[size];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    temp[j] = 1;
                    counter++;
                }
            }
        }
        int[] array1 = new int[size - counter];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (temp[i] == 0) {
                array1[j++] = array[i];
            }
        }
        System.out.println("Array After removing Duplicates is : ");
        for (int element : array1) {
            System.out.print(element + " ");
        }
    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Number of Elements in the Array");
	        int size = sc.nextInt();
	        int[] array = new int[size];
	        System.out.println("Enter Array Elements");
	        for (int i = 0; i < size; i++) {
	            array[i] = sc.nextInt();
	        }
	        removeDuplicates(array, size);
	    }

	    
	}


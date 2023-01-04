package Wrapper;
import java.util.*;

// FIND THE ENTRY WITH MOST FREQUENCY

 class Test{
	public static void findRepeatedNumber(int array[], int limit) {

		int i=0, count=1, j=0, element = -1;

		while(i<array.length) {

		if(count >= limit) {
		System.out.println(element);
		return;
		}
		j = i+1;
		count=1;

		while(j<array.length) {

		if(array[i] == -1)
		continue;

		else if(array[i] == array[j]) {
		element = array[i];
		count += 1;
		array[j] = -1;
		}
		j++;
		}
		i++;
		}

		System.out.println("Invalid");
		}



		public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sizeOfArray = s.nextInt();
		int array[] = new int[sizeOfArray];

		for(int i=0; i<sizeOfArray; i++)
		array[i] = s.nextInt();

		if(sizeOfArray%2 != 0)
		findRepeatedNumber(array,(sizeOfArray/2) + 1);

		else
		findRepeatedNumber(array,sizeOfArray/2);



		}



		
}

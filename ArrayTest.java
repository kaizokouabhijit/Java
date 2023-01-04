package inputoutputpackage;

public class ArrayTest {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,9,10,11};
        int count = 0;
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] %2==0)
            {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;

            }

        }
        for(int i=count;i<arr.length;i++)
        {
            if(arr[i] %3==0)
            {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;

            }

        }
        for(int i=count;i<arr.length;i++)
        {
            if(arr[i] %5==0)
            {
                temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;

            }

        }

       for(int j:arr)
       {
           System.out.print(j + " ");
       }
    }
}

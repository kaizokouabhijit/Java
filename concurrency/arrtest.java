package concurrency;

public class arrtest {
    public static void main(String[] args) {
        int count = 0;
        int [] arr = {2,3,4,5,6,7,8,9,10,11};
        for(int i = 0; i<10;i++)
        {
            if(arr[i]%2==0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }else{continue;}
        }
        for(int i = 0; i<10;i++)
        {
            if(arr[i]%3==0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }else{continue;}
        }
        for(int i = 0; i<10;i++)
        {
            if(arr[i]%5==0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }else{continue;}
        }
        System.out.println(arr);
    }

}

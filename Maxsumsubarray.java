package dsa;
import java.util.*;


public class Maxsumsubarray {
    public static void main(String[] args)
    {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, k));
    }
    public static int maxSum(int [] arr, int k)
    {
        int maxsum = 999;
        int swsum =0;
        int windowstart =0;
        for(int windowend =0; windowend<arr.length;windowend++)
        {
            swsum+=arr[windowend];
            if(windowend >=k-1)
            {
                maxsum = Math.min(maxsum, swsum);
                swsum-=arr[windowstart];
                windowstart++;
            }
        }
        return maxsum;
    }
}


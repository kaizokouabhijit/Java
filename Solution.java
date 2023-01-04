package dsa;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {




    public static void main(String[] args) {

        int [] arr ={1,2,3};


        int[] ans = getConcatenation(arr, 1);

        for(int i:ans)
        {
            System.out.println(i);
        }


    }

    public static int [] getConcatenation(int [] arr, int first) {


        int [] ans = new int [arr.length+1];

        ans[0] = first;

        for(int i=0;i<arr.length;i++)
        {
            ans[i+1] = ans[i] ^arr[i];
        }


        return ans;
    }
}

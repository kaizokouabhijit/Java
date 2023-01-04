package dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class rem_dup {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        remdup(nums);
    }
    public static void remdup(int [] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        Object[] resarr = map.entrySet().toArray();
        Object[] resarr1 = map.keySet().toArray();
        System.out.println(Arrays.toString(resarr1));
    }
}

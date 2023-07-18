package Arrays;

import java.util.*;

public class Two_sum {
    public int[] two_sum(int [] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int diff=target-arr[i];
            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff),i};
            }
            else {
                map.put(arr[i],i);
            }
        }
        return null;
    }
}

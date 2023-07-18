package Arrays;
import java.util.*;

public class Minimum_size_subarraysum {
    public int min_size_subarraysum(int arr[],int target)
    {
        int sum=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            while(sum>=target)
            {
                min=Math.min(min,(i-j+1));
                sum-=arr[j++];
            }
        }
        return min==Integer.MAX_VALUE ?0:min;

    }
}

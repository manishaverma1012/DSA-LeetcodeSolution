package Arrays;

public class Container_with_most_water {
    public int mostwater(int[] arr)
    {
        int maxwater=0;
        int distance=0;
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            distance=j-i;
            maxwater=Math.max(maxwater,Math.min(arr[i],arr[j])*distance);
            if(arr[i]<=arr[j])
            {
                i++;
            }
            else {
                j--;
            }


        }

        return maxwater;

    }
}

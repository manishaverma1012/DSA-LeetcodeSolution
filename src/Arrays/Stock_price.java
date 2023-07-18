package Arrays;

public class Stock_price {
    public int stockI(int [] arr)
    {
//        int i=0;
//        int j=1;
//        int diff=0;
//        int max=0;
//        while(j<arr.length)
//        {
//            if(arr[i]>arr[j]||j+1>arr.length)
//            {
//                j=++i+1;
//            }
//            else {
//                diff=arr[j]-arr[i];
//                if(max<diff)
//                {
//                    max=diff;
//                }
//                j++;
//            }
//        }
//        return max;
        int min=Integer.MAX_VALUE;
        int profit=0;
        int diff=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            diff=arr[i]-min;
            if(diff>profit)
            {
                profit=diff;
            }
        }
        return profit;

    }
}

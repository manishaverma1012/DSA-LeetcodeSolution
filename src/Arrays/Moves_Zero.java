package Arrays;


import java.util.Arrays;

public class Moves_Zero {
    public void moveszero(int arr[])
    {
        int left=0;int right=0;
        while(right<arr.length)
        {
            if(arr[right]!=0)
            {
                swap(arr,right,left);
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public void swap(int arr[],int right,int left)
    {
        int temp=arr[right];
        arr[right]=arr[left];
        arr[left]=temp;
    }
}

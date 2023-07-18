package Arrays;

public class Missing_number {
    public int missing_number(int arr[])
    {
        int i=0;
        while(i<arr.length)
        {
            if(arr[i]<arr.length && arr[i]!=arr[arr[i]])
            {
                int temp=arr[i];
                arr[i]=arr[arr[i]];
                arr[arr[i]]=temp;
            }
            else {
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j)
            {
                return j;
            }
        }
        return arr.length;
    }
}

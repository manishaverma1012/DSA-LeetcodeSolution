package Arrays;

import java.util.Arrays;

public class Sort_colors {
    public void sortcolors(int arr[])
    {
        int i=0;
        int j=arr.length-1;
        int index=0;
        while(index<=j)
        {
            if(arr[index]==2)
            {
                arr[index]=arr[j];
                arr[j]=2;
                j--;
                index--;



            }
            if(arr[index]==0)
            {
                arr[index]=arr[i];
                arr[i]=0;
                i++;

            }
            index++;
        }
        System.out.println(Arrays.toString(arr));

    }
}

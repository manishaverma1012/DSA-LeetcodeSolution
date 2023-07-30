package Arrays;

public class kthmissingpsitiveveinteger {
    public static int kmissingnumber(int a[],int k)
    {
        int start=0;
        int end=a.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if((a[mid])-mid+1 <=k)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return start+k;

    }
    public static void main(String[] args) {
        int array[]={2,3,4,7,11};
        int k=5;
        System.out.println(kmissingnumber(array,k));
    }
}

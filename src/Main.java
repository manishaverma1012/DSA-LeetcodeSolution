import Arrays.Next_Permutation;
import Arrays.Two_sum;
import java.util.Arrays;
import Arrays.Container_with_most_water;
import Arrays.Sort_colors;
import Arrays.Minimum_size_subarraysum;

public class Main {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,4,3};
        Minimum_size_subarraysum obj=new Minimum_size_subarraysum();
        int ans=obj.min_size_subarraysum(arr,7);
        System.out.println(ans);


    }
}

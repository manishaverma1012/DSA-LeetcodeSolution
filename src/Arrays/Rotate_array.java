package Arrays;

public class Rotate_array {
    public void rotate_array(int[] nums,int k)
    {
        k=k%nums.length;
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public void reverse(int[] nums,int i, int j)
    {
        int temp=0;
        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
}

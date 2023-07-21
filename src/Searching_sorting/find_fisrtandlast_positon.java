package Searching_sorting;

public class find_fisrtandlast_positon {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=findfirst(nums,target);
        arr[1]=findlast(nums,target);
        return arr;

    }
    public int findfirst(int[] nums,int target)
    {
        int idx=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
            if(nums[mid]==target)
            {
                idx=mid;
            }
        }
        return idx;
    }
    public int findlast(int[] nums,int target)
    {
        int idx=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<=target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
            if(nums[mid]==target)
            {
                idx=mid;
            }
        }
        return idx;
    }

}

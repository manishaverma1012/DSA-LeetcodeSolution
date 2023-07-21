package Searching_sorting;

import java.util.Random;

public class kth_largest_elementarray {
    //main logic:->>> //idea is to solve this question to use quick sort algo relative that we can call it quick select.
    // by using priority queue time take in best case o(n) in worst case o(n*n)

//    **quickselect
//    How Does Quickselect Work?
//    Quickselect works identical to quicksort in that we:
//
//    Pick a pivot
//    Partition the data into two where:
//       Numbers less than the pivot go to the left
//       Numbers greater than the pivot go to the right
//    However, instead of recursing into both sides as in Quicksort, quickselect only recurs into one side; whichever one would have our kth largest element.
//    The main thing to note here is that our pivot at any given partition will always end up at the correct index. Therefore, we just need to check:
//
//    If our pivot is at our "kth largest" index, return the number at that index.
//    If our pivot comes before the "kth largest" index, perform quickselect on the right partition.
//    If our pivot comes after the "kth largest" index, perform quickselect on the left partition.
//    Performing quickselect only on one partition reduces our average-case complexity from O(nlogn) to O(n).
    public int findKthLargest(int [] nums,int k)
    {
        return quickselect(nums,0,nums.length-1,nums.length-k);
    }
    public int quickselect(int[] nums,int left,int right,int k)
    {
        if(left==right)
        {
            return nums[left];
        }
        int pindex=new Random().nextInt(right-left+1)+left;
        pindex=partition(nums,left,right,pindex);
        if(k==pindex)
        {
            return nums[k];
        }
        else if(k>pindex)
        {
            return quickselect(nums,pindex+1,right,k);
        }
        else {
            return quickselect(nums,left,pindex-1,k);
        }


    }
    public int partition(int[] nums, int left, int right, int pindex)
    {
        int pivot=nums[pindex];
        swap(nums,pindex,right);
        pindex=left;
        for(int i=left;i<=right;i++)
        {
            if(nums[i]<=pivot)
            {
                swap(nums,i,pindex++);
            }
        }
        return pindex-1;

    }
    public void swap(int nums[],int x,int y)
    {
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }


}

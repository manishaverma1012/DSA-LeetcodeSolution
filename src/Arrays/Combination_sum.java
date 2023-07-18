package Arrays;

import java.util.ArrayList;
import java.util.*;
//solution of all backtracking questions
//https://leetcode.com/problems/combination-sum/solutions/16502/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning/
public class Combination_sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        Backtrack(list,new ArrayList<>(),candidates,target,0);
        return list;

    }
    public void Backtrack(List<List<Integer>> list, List<Integer> templist,int []nums,int remain,int start)
    {
        if(remain<0)
        {
            return;
        }
        else if(remain==0)
        {
            list.add(new ArrayList<Integer>(templist));
        }
        else
        {
            for(int i=start;i<nums.length;i++)
            {
                templist.add(nums[i]);
                Backtrack(list,templist,nums,remain-nums[i],i);
                templist.remove(templist.size()-1);
            }
        }
    }
}

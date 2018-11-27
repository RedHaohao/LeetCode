package Subsets78;

import java.util.ArrayList;
import java.util.List;



public class Solution
{
	List<List<Integer>> result=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
    	List<Integer> list=new ArrayList<>();
    	backTrack( 0,nums.length,list,nums);
    	return result;
    }
    public void backTrack(int start,int n,List<Integer> list,int[] nums)
    {
    	
    	
    	result.add( new ArrayList<>(list));
    	
    	
    	
    		for(int i=start;i<nums.length;i++)
    		{
    			list.add(nums[i]);
    			
    			backTrack(i+1, n-1, list, nums);
    			list.remove(list.size()-1);
    		}
    	
    		
    }
}

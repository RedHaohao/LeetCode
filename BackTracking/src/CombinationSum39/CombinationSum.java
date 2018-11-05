package CombinationSum39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class CombinationSum
{
	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> combinationSum(int[] candidates, int target)
	{
		Arrays.sort(candidates);
		List<Integer> list=new ArrayList<>();
		backTracking(candidates, target, 0,0, list);
		return result;
	}
	
	public void backTracking(int[]candidates,int target,int currentValue,int start, List<Integer> list)
	{

		if(currentValue>target)
		{

			return;
		}
		if(currentValue==target)
		{
			result.add(new ArrayList<>(list));
		}
		else if (currentValue<target) 
		{
			for(int i=0;i<candidates.length;i++)
			{
				list.add(candidates[i]);
				currentValue+=candidates[i];
				backTracking(candidates, target, currentValue, 0,list);
				currentValue-=list.get(list.size()-1);
				list.remove(list.size()-1);
			}
		}
			
	}
	public static void main(String[] args)
	{
		int[] candidates= {2,3,6,7};
		CombinationSum c=new CombinationSum();
		c.combinationSum(candidates, 7);
		System.out.println("1");
	}
	
}

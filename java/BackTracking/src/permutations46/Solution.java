package permutations46;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> permute(int[] nums)
	{
		int[] visited = new int[nums.length];
		List<Integer> list = new ArrayList<>();
		backTrack(0, nums.length, nums, list, visited);
		return result;
	}

	public void backTrack(int start, int n, int[] nums, List<Integer> list, int[] visited)
	{
		if (n == 0)
		{
			result.add(new ArrayList<>(list));
			return;
		} else if (n > 0)
		{
			for (int i = 0; i < nums.length; i++)
			{
				if (visited[i] == 0)
				{
					visited[i]=1;
					list.add(nums[i]);
					backTrack(i + 1, n - 1, nums, list, visited);
					list.remove(list.size() - 1);
					visited[i]=0;
				}
			}
		}
	}
}

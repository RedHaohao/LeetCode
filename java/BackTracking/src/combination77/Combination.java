package combination77;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Combination
{

	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> combine(int n, int k)
	{
		List<Integer> list = new ArrayList<Integer>();
		backtracking(n, k, 1, list);
		return result;
	}

	public void backtracking(int n, int k, int start, List<Integer> list)
	{
		if (k < 0)
			return;
		if (k == 0)
			
			result.add(list);
		else
		{
			for (int i = start; i <= n; i++)
			{
				list.add(i);
				backtracking(n, k - 1, start + 1, list);
				list.remove(list.size() - 1);
			}
		}
	}


}

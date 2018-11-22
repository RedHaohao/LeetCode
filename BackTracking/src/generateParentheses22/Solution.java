package generateParentheses22;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<String> generateParenthesis(int n)
	{
		List<String> result = new ArrayList<>();
		String str = "";
		BackTrack(0, 0, n, str, result);
		return result;
	}

	public void BackTrack(int left, int right, int n, String str, List<String> result)
	{
		if (left == right && left == n)
		{
			result.add(str);
			return;
		}
		if (left <= n)
		{
			BackTrack(left+1, right, n, str + "(", result);
		}
		if (right < left)
		{
			BackTrack(left, right+1, n,  str + ")", result);
		}
	}

	public static void main(String[] args)
	{
		Solution a = new Solution();
		List<String> result = new ArrayList<>();
		result = a.generateParenthesis(2);
		System.out.println("1");
	}
}

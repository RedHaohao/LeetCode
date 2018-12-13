package beautifulArrangement;

import java.util.ArrayList;
import java.util.List;

class Solution {
	int count;
	
	List<Integer> list=new ArrayList<>();
    public int countArrangement(int N) {
    	int []a=new int[N];
    	for(int i=0;i<N;i++)
    	{
    		a[i]=i+1;
    	}
    	backTrack(0,list,0,a,N);
        return count;
    }
    public void backTrack(int start,List<Integer> list,int n,int a[],int N)
    {
    	if(n==N)
    		count++;
    	else if(n>N)
    		return;
    	else if(n<N)
    	{
    		for(int i=0;i<N;i++)
    		{
    			if(list.contains(a[i]))
    				continue;
    			if(a[i]%(n+1)==0||(n+1)%a[i]==0)
    			{
    				list.add(a[i]);
    				backTrack(i+1, list, n+1, a, N);
    				list.remove(list.size() - 1);
    			}
    		}
    	}
    }
    public static void main(String []args)
    {
    	Solution solution=new Solution();
    	solution.countArrangement(2);
    }
}

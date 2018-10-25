package javaone;


public class Javaone
{
	public int singleNumber(int[] nums)
	{
		int i = 0; int count=0;
		int num[]=new int[nums.length/2+1];
		for (; i < nums.length-1 ; i++)
		{
			int j=i+1;
			
			for(;j < nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					num[count]=nums[i];
					count++;
					break;
				}
				
			}
			if(j==nums.length)
			{
				int k=0;
				for(;k<count;k++)
				{
					if(nums[i]==num[k])
					{
						break;
					}
				}
				if(k==count)
				{
					break;
				}
				
			}

		}
		return nums[i];
	}
	public Javaone() {
		
	}

	public static void main(String[] args)
	{
		int []nums= {1,1,4,4,2};
		Javaone a=new Javaone();
		System.out.println(a.singleNumber(nums));
		
		
	}
}

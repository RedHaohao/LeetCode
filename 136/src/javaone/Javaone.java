package javaone;

import java.util.HashSet;
import java.util.Iterator;

public class Javaone
{
	public int singleNumber(int[] nums)
	{
		// solution 1
		//nums 题目给的数组  num是拥有重复数字的集合，
		//思路先遍历一遍 nums数组 看有没有与nums[i]相同的数字，有则放入重复数组num[]中，如果到结束都没发现，
		//再从num[]中找有没有该数字 ，还是没有的话就说明 这个数字是single number。
		
		/*int i = 0; int count=0;
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
		return nums[i];*/
		
		
		//solution 2
		//思路    建立一个hashset(不允许有重复数字)  遍历数组 如果不包含该数字 就添加进去，第二次发现同样的数字 就会发现已经包含该数字
		//包含的话就删除，到最后肯定只剩那个singleNumber
		HashSet<Integer> hSet=new HashSet<>();
		for(int i=0;i<nums.length;i++)
		{
			if(!hSet.contains(nums[i]))
			{
				hSet.add(nums[i]);
			}
			else
			{
				hSet.remove(nums[i]);
			}
			
		}
		int num=0;
		for(Integer i:hSet)
		{
			num=i;
		}
		return num;
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

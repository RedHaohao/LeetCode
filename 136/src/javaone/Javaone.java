package javaone;

import java.util.HashSet;
import java.util.Iterator;

public class Javaone
{
	public int singleNumber(int[] nums)
	{
		// solution 1
		//nums ��Ŀ��������  num��ӵ���ظ����ֵļ��ϣ�
		//˼·�ȱ���һ�� nums���� ����û����nums[i]��ͬ�����֣���������ظ�����num[]�У������������û���֣�
		//�ٴ�num[]������û�и����� ������û�еĻ���˵�� ���������single number��
		
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
		//˼·    ����һ��hashset(���������ظ�����)  �������� ��������������� ����ӽ�ȥ���ڶ��η���ͬ�������� �ͻᷢ���Ѿ�����������
		//�����Ļ���ɾ���������϶�ֻʣ�Ǹ�singleNumber
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

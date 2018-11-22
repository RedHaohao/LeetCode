package LongPressedName925;



class Solution
{
	public boolean isLongPressedName(String name, String typed)
	{

		int j=0;
		int i=0;
		while(i<name.length())
		{
			if(j==typed.length())
			{
				return false;
			}
			if(name.charAt(i)==typed.charAt(j))
			{
				j++;
				i++;
			}
			else
			{
				if(j==0||typed.charAt(j)!=typed.charAt(j-1))
				{
					return false;
				}
				else
				{
					j++;
				}
			}
		}
		return true;
	}
	public static void main(String []args)
	{
		Solution s=new Solution();
		s.isLongPressedName("pyplrz","ppyypllr");
	}
}
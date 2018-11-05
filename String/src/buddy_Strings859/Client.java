package buddy_Strings859;

public class Client
{

    public static boolean buddyStrings(String A, String B) { 
    	int len1=A.length();
    	int len2=B.length();
    	int a[]=new int[10];
    	int count=0;
    	if(len1!=len2)
    	{
    		System.out.print("false");
    		return false;
    		
    	}
    	if(len1==0)
    	{
    		return false;
    	}
    	for(int i=0;i<len1;i++)
    	{
    		if(A.charAt(i)!=B.charAt(i))
    		{
    			a[count]=i;
    			count++;
    			if(count>2)
    			{
    				System.out.print("false");
    				return false;
    			}
    				
    		}
    	}
    	if(count==0)
    	{
      	  for(int i=0;i<len1;i++)
      	  {
                for(int j=i+1;j<len1;j++)
                {
                    if(A.charAt(i)==A.charAt(j)) 
                  	  return true;
                }
      	  }
      	  return false;
    	}


    	if(A.charAt(a[0])==B.charAt(a[1])&&A.charAt(a[1])==B.charAt(a[0]))
    	{
    		System.out.print("true");
    		return true;
    	}
    	System.out.print("false");
    	return false;
        
    }
	public static void main(String[] args)
	{
		buddyStrings("aa", "aa");

		
	}

}

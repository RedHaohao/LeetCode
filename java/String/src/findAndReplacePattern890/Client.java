package findAndReplacePattern890;

import java.util.ArrayList;
import java.util.List;



public class Client
{
    public List<String> findAndReplacePattern(String[] words, String pattern) {
    	List<String> list=new ArrayList<String>();
    	int patterLen=pattern.length();
    	int []patternNum=new int[patterLen];
    	for(int i=0;i<patterLen;i++)
    	{
    		patternNum[i]=0;
    	}
    	for(int i=0;i<patterLen;i++)
    	{
			if(patternNum[i]==0)
			{
				patternNum[i]=i+1;
			}
    		for(int j=i+1;j<patterLen;j++)
    		{

    			if(pattern.charAt(j)==pattern.charAt(i))
    			{
    				patternNum[j]=i+1;
    			}
    			
    		}
    	}
    	
    	return list;
        
    }
	public static void main(String[] args)
	{
		
		Client client=new Client();
		String []str= {"str","egg"};
		client.findAndReplacePattern(str, "abb");
		
		
		
		
		
	}
}

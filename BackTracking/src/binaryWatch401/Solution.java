package binaryWatch401;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<String> result=new ArrayList<>();
	int hours[]= {1,2,4,8};
	int minutes[]= {1,2,4,8,16,32};
//	int hour=0;
//	int minute=0;
//	int time=0;
    public List<String> readBinaryWatch(int num) {
        
    	backTrack(num,0,0,0);
    	return result;
    }
    public void  backTrack(int n,int start,int hour,int minute)
    {
    	if(n==0)
    	{

    		String str=String.valueOf(hour);
    		if(minute<10)
    		{
    			str=str+":0"+String.valueOf(minute);
    		}
    		else
    			str=str+":"+String.valueOf(minute);
    		if(hour<12&&minute<60)
    		{
    			result.add(str);
    		}
    		
    	}
    	else if(n<0)
    		return;
    	else if(n>0)
    	{
    		for(int i=start;i<10;i++)
    		{
    			if(i<6)
    			{
    				minute+=minutes[i];
    			}
    			else
    			{
    				hour+=hours[i-6];
    			}
    			backTrack(n-1, i+1,hour,minute);
    			if(i<6)
    			{
    				minute-=minutes[i];
    			}
    			else
    			{
    				hour-=hours[i-6];
    			}
    		}
    	}
    	
    		
    }
}

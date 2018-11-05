

//  c++ ДњТы
class Solution {
public:
    bool isValid(string s) 
    {
    stack<char> stack1;
	for(int i=0;i<s.length();i++)
	{
		if(s[i]=='{'||s[i]=='('||s[i]=='[')
        {
            stack1.push(s[i]);
            continue;
        }	
		if(stack1.size()>=1)
		{
			if(stack1.top()=='{'&&s[i]=='}')
			{
				stack1.pop();
				continue;
			}
			if(stack1.top()=='['&&s[i]==']')
			{
				stack1.pop();
				continue;
			}
			if(stack1.top()=='('&&s[i]==')')
			{
				stack1.pop();
				continue;
			}
		}
        return false;
	}
	if(stack1.size()!=0)
		return false;
	else
		return  true;
   
  
 
    
        
    }
};
class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0|| x%10==0&&x!=0)
            return false;
        int temp=0;
        while (x>temp)
        {
            temp=x%10+temp*10;
            x/=10;
        }
        if(x==temp||(temp/=10)==x)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
        
    }
};
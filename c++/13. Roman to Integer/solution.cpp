class Solution {
public:
    int romanToInt(string s) {
        int len=s.length();
        if(len==0)
            return 0;
        map<char,int > rInt;
        rInt.insert(pair<char,int>('I',1));
        rInt.insert(pair<char,int>('V',5));
        rInt.insert(pair<char,int>('X',10));
        rInt.insert(pair<char,int>('L',50));
        rInt.insert(pair<char,int>('C',100));
        rInt.insert(pair<char,int>('D',500));
        rInt.insert(pair<char,int>('M',1000));
        int result=0;
        int cur=0;
        int pre=0;
        for(int i=0;i<len;i++)
        {
 
    
            
            pre=cur;
            char c=s[i];
            
            cur=rInt[c];
            if(cur>pre)
                result=result-pre*2;
            result+=cur;
        }
        return result;
        
    }
};
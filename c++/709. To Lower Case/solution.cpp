// 简单的大小写转换问题
// 需注意的是a 是97  A 是65 ascii



class Solution {
public:
    string toLowerCase(string str) {
        string res="";
        int len=str.size();
        char temp;
        for(int i=0;i<len;i++)
        {
            if(str[i]>='A'&&str[i]<='Z')
            {
                
                temp=str[i]-'A'+'a';
                res+=temp;
            }
            else
                res+=str[i];
        }
        return res;
    }
};
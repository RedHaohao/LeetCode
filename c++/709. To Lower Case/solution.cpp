// �򵥵Ĵ�Сдת������
// ��ע�����a ��97  A ��65 ascii



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
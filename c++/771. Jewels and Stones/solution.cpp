//ʹ��map�汦ʯ  ����ʯͷ  ����ʯmap����û�и�ʯͷ ���� res+1 �� ��������

class Solution {
public:
    int numJewelsInStones(string J, string S) {
        unordered_map<char,int > stone;
        int jLen=J.length();
        int sLen=S.length();
        int res=0;
        for(int i=0;i<jLen;i++)
        {
            if(stone.find(J[i])!=stone.end())
            {
                stone[J[i]]++;
                
            }
            else
            {
                stone[J[i]]=1;
            }
        }
        for(int i=0;i<sLen;i++)
        {
            if(stone.find(S[i])!=stone.end())
                res++;
        }
        return res;
    }
};
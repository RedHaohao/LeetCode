class Solution 
{
public:
    int monotoneIncreasingDigits(int n)
    {
        string num = to_string(n);
        int begin = num.length();
        for (int i = num.length() - 1; i >= 1; i--)
        {
            if (num[i] >= num[i - 1])
                continue;
            else
            {
                num[i - 1]--;
                begin = i;
            }
        }
        for (int i = begin; i < num.length(); i++)
            num[i] = '9';
        return stoi(num);
    }
};

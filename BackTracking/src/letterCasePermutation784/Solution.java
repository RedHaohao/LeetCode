package letterCasePermutation784;

class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        String temp = "";
        letter(list,S,temp,0);
        return list;
    }
    
    public static void letter(List<String> list,String S, String temp , int index){
 
        if (S.length() == temp.length()){ list.add(temp);return; }
        
       // if (index == S.length()) return;
 
        temp+=S.charAt(index);
        letter(list,S,temp,index+1);
        temp = temp.substring(0,temp.length()-1);
        
        if (S.charAt(index) >= 'a' && S.charAt(index) <= 'z'){//小写字母a-z
            temp += (char)(S.charAt(index) + 'A' - 'a');
            letter(list,S,temp,index+1);
         }else if(S.charAt(index) >= 'A' && S.charAt(index) <= 'Z'){//大写字母A-Z
            temp += (char)(S.charAt(index) + 'a' - 'A');
            letter(list,S,temp,index+1);
        }
    }
}

// c++方法
//#include <iostream>
//#include<string>
//#include<vector>
//using namespace std;
//class Solution 
//{
//public:
//	vector<string> letterCasePermutation(string S) 
//	{
//		count=0;
//		str="";
//		for(int i=0;i<10;i++)
//		{
//			a[i]=-1;
//		}
//		for(int i=0;i<S.length();i++)
//		{
//			if((S[i]>=65&&S[i]<=90)||(S[i]>=97&&S[i]<=122))
//			{
//				a[i]=1;
//				count++;
//			}
//		}
//		backTrack(0,S,str);
//		return result;
//	}
//	void backTrack(int i,string S,string str)
//	{
//
//		if(str.length()==S.length())
//		{
//			result.push_back(str);
//			return;
//		}
//		else
//		{
//			str+=S[i];
//			backTrack(i+1,S,str);
//			str=str.substr(0,str.length()-1);
//
//			if(a[i]==1)
//			{
//
//				if(S[i]>=65&&S[i]<=90)
//				{
//					str+=S[i]+32;
//					backTrack(i+1,S,str);
//				}
//				else
//				{
//					str+=S[i]-32;
//					backTrack(i+1,S,str);
//				}
//				
//				//str[i]=S[i];
//			}
//
//
//
//
//
//		}
//	}
//	void show()
//	{
//		vector<string>::const_iterator iter;
//		for(iter=result.cbegin();iter!=result.cend();iter++)
//		{
//			cout<<*iter<<endl;
//		}
//	}
//private:
//	vector<string > result;
//	int count;
//	int a[10];
//	string str;
//};
//
//int main() 
//{
//	Solution s;
//	s.letterCasePermutation("a1B2");
//	s.show();
//
//
//
//	return 0;
//}

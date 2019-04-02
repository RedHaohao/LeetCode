class Solution {
public:
    string simplifyPath(string path) {
        vector<string > res;
        string str;
        string result="";
        stringstream ss(path);
        while(getline(ss,str,'/'))
        {
            if(str=="."||str=="")
                continue;
            else if(str==".."&&res.size()!=0)
                res.pop_back();
            else if(str!="..")
                res.push_back(str);
        }

        for(auto &a:res)
        {
            result+="/";
            result+=a;
        }
        if(res.empty())
        {
            return "/";
        }
        else
        {
            return result;
        }
        
    }
};
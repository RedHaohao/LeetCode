class Solution 
{
public:
	bool pyramidTransition(string bottom, vector<string>& allowed)
	{
		unordered_map<string, vector<char>> hash;
		for (auto &s : allowed)
		{
			hash[s.substr(0, 2)].push_back(s[2]);
		}
		string curr("");
		return DFS(bottom, curr, 0, hash);
	}
	bool DFS(string &prev, string &curr, int k, unordered_map<string, vector<char> > &hash)
	{
		if (1 == prev.size())
			return true;
		if (k + 1 == prev.length())
		{
			string next(""); 
			return DFS(curr, next, 0, hash);
		}
		else
		{
			string key = prev.substr(k, 2);
			if (hash.count(key) == 0)
				return false;
			else
			{
				vector<char> val = hash[key];
				for (int i = 0; i < val.size(); i++)
				{
					curr.push_back(val[i]);
					if(DFS(prev, curr, k + 1, hash))
                        return true;
					curr.pop_back();
				}
                return false;
			}
		}

	}
};
class Solution 
{
public:
	vector<vector<int>> subsets(vector<int>& nums) 
	{
		vector<vector<int> > result;
		vector<int > temp;
		backTrack(temp,result,nums,0);
		return result;
	}
	void backTrack(vector<int > &temp, vector<vector<int> > &result, const vector<int>& nums,int start)
	{
		result.push_back(temp);
		for (int i = start; i < nums.size(); i++)
		{
			temp.push_back(nums[i]);
			backTrack(temp, result, nums, i + 1);
			temp.pop_back();
		}
	}
};
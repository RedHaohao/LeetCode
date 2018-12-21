// 思路 将数组中的值作为索引 通过索引找到对应值 然后取其相反数 第二次遇到相同的值时会有相同的索引 再次取反 就是整数 然后把索引保存就是要找的重复的数
class Solution {
public:
	vector<int> findDuplicates(vector<int>& nums) {
		vector<int > result;
		for (int i = 0; i<nums.size(); i++)
		{
			nums[abs(nums[i]) - 1] = -nums[abs(nums[i]) - 1];
            if (nums[abs(nums[i]) - 1]>0)
			{
				result.push_back(abs(nums[i]));
			}

		}

		return result;
	}
};

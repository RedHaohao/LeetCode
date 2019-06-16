class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int index=0;
        int len=nums.size();
        if(len==0)
            return 0;
        for(int i=1;i<len;i++)
        {
            if(nums[index]!=nums[i])
            {
                nums[++index]=nums[i];
            }
        }


    
        return index+1;
        
    }
};
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {

        

        int ans = 0;
        for(int i = 0 ; i < nums.size()-ans ; i ++) {
            if(nums[i] == val) {
                ans ++;
                nums[i] = nums[nums.size()-ans];
                i --;
            }
        }
        return nums.size()-ans;
    


    }
};

//简化版的双指针法，nums.size()-ans 就是另一个指针
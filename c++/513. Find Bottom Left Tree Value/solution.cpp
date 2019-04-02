//深度优先搜索 先左结点再右结点 所以每一次新访问一层 必定访问的是最左面的结点，但到新的一层时 更新数据

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int maxDeepth=0;
    int val;
    int findBottomLeftValue(TreeNode* root) {
        val=root->val;
        dfs(root,0);
        return val;
    }
    void dfs(TreeNode * root,int deepth)
    {
        if(!root)
        {
            return;
        }
        
        if(deepth>maxDeepth)
        {
            val=root->val;
            maxDeepth=deepth;
        }
        if(root->left)
            dfs(root->left,deepth+1);
        if(root->right)
            dfs(root->right,deepth+1);
        
        
    }
};
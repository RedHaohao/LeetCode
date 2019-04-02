//����������� ���������ҽ�� ����ÿһ���·���һ�� �ض����ʵ���������Ľ�㣬�����µ�һ��ʱ ��������

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
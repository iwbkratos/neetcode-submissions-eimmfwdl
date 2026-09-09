/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max(root);
        return ans;
    }

    private int max(TreeNode node)
    {
        if(node == null)
          return 0;
        
        int l = max(node.left);
        int r = max(node.right);
        l = Math.max(l,0);
        r = Math.max(r,0);
        int p = node.val;
        ans = Math.max(ans,p+r+l);
        return p + Math.max(l,r);
    }

}

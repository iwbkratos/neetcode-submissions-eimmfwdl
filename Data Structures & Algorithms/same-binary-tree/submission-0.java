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

    public boolean isSame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        isSame(p,q);
        return isSame;
    }

    private void isSame(TreeNode p, TreeNode q)
    {

        if((p == null && q != null) || (p != null && q == null))
            isSame = false;

        if( p == null || q == null )
        {
            return;
        }
        
        if((p!= null && q != null) && (p.val != q.val))
            isSame = false;
        
        isSame(p.left,q.left);
        isSame(p.right,q.right);
    }
}

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

    public TreeNode node = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        lowest(root,p,q);
        return node;
    }

    private void lowest(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root == null)
            return;

        if(root.left != null && root.right != null)
        {
           if (root.left.val == p.val && root.right.val == q.val)
           {
                node = root;
           }
           else if(root.left.val == p.val)
           {
               node = root;
           }
           else if(root.right.val == q.val)
           {
               node = root;
           }
        }
        else if(root.left != null)
        {
            if(root.left.val == q.val)
            {
                node = root;
            }
        }
        else if(root.right != null)
        {
            if(root.right.val == q.val)
            {
                node = root;
            }
        }
        lowest(root.left,p,q);
        lowest(root.right,p,q);
    }
}

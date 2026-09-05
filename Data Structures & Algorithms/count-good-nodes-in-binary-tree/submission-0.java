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

    private int count =0;
    public int goodNodes(TreeNode root) {
        good(root,root.val);
        return count;
    }

    private void good(TreeNode node, int pre)
    {
        if(node == null)
            return;

        if(node.val >= pre)
        {
            count++;
        }

        good(node.left,pre);
        good(node.right,pre);
    }
}

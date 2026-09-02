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

    private static TreeNode found = null;
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode curr = root;
         find(curr,key);

        if(found != null)
        {
         found.val = found.right.val;
         found.right = null;
        }
         return root;

    }
    private static void find(TreeNode node,int key)
    {
        if(node == null)
            return;

        if(node!= null && node.val == key)
        {
         found = node;
         return;
        }

        find(node.left,key);
        find(node.right,key);
    }
}
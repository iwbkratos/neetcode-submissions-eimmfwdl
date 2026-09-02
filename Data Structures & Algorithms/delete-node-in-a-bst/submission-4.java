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
        // TreeNode curr = root;
         find(root,key);

        // if(found != null)
        // {
        //  if(found.right != null){
        //    found.val = found.right.val;
        //    found.right = null;
        //  }
        //  else if(found.left != null){
        //     found.val = found.left.val;
        //     found.left = null;
        //  }
        //  else{
        //     found = null;
        //   }
           
        // }
         return root;

    }
    private static void find(TreeNode node,int key)
    {
        if(node == null)
            return;

        if(node!= null && node.val == key)
        {
            if(node.right != null){
                node.val = node.right.val;
                node.right = null;
            }
            else if(node.left != null){
                node.val = node.left.val;
                node.left = null;
            }
            else{
                node = null;            
                return;
            }
        }

        find(node.left,key);
        find(node.right,key);
    }
}
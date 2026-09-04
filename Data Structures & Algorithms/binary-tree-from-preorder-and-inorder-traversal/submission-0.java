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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       int s1 =0;
       int s2 = 0;
       int e1 = preorder.length-1;
       int e2 = inorder.length-1; 

       return build(preorder,s1,e1,inorder,s2,e2);
       
    }

    private TreeNode build(int[]p, int s1, int e1, int in[], int s2, int e2)
    {
        if(s1 > e1)
        {
            return null;
        }

        TreeNode root = new TreeNode(p[s1]);

        int index = -1;

        for(int i=s2; i<=e2; i++)
        {
            if(p[s1] == in[i])
            {
                index = i;
                break;
            }
        }

        int c = index-s2;

        root.left = build(p, s1+1, s1+c, in, s2, index-1);
        root.right = build(p,s1+c+1, e1, in, index+1, e2);

        return root;
    }

}

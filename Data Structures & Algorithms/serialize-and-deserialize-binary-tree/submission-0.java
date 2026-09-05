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

public class Codec {

    StringBuilder sb = new StringBuilder("");
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        encode(root);
        return new String(sb);
    }

    public void encode(TreeNode root)
    {
        if(root == null)
        {
            sb.append("null,");
            return;
        }

        sb.append(root.val+",");
        encode(root.left);
        encode(root.right);
    }
    //index
    int i = 0;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        return  decode(arr);
    }

    public TreeNode decode(String[] arr)
    {
        if(arr[i].equals("null"))
        {
            i++;
         return null;
        }
        int val = Integer.parseInt(arr[i++]);
        TreeNode root = new TreeNode(val);

        root.left = decode(arr);
        root.right = decode(arr);

        return root;
    }
}

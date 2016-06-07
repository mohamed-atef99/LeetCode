/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) 
    {
        int countleft=countnodes(root.left);
        if(k<countleft+1)
           return  kthSmallest(root.left,k);
        else if(k>countleft+1)
           return kthSmallest(root.right,k-1-countleft);
         else
           return root.val;
    }
    public int countnodes(TreeNode root)
    {
        if(root==null)
          return 0;
         return 1+countnodes(root.left)+countnodes(root.right);
    }
}
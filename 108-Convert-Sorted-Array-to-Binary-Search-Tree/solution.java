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
   public  TreeNode sortedArrayToBST(int[] nums) 
    {
          return balance(0,nums.length-1,nums);
    }
    public  TreeNode balance(int i,int j,int [] nums)
    {
        if(i<=j)
        {
            int mid=(i+j)/2;
            TreeNode root=new TreeNode(nums[mid]);
            root.left=balance(i,mid-1,nums);
            root.right=balance(mid+1,j,nums);
            return root;
        }
        else
        {
            return null;
        }
    }
    
}
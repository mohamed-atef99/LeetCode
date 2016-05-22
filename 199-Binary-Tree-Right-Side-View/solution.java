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
    public  List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> result=new LinkedList<Integer>();
        if(root!=null)
        {
            Queue<TreeNode> levelqueue=new LinkedList<TreeNode>();
            levelqueue.add(root);
            int currentnodes=0;
            while(!levelqueue.isEmpty())
            {
                result.add(levelqueue.peek().val);
                currentnodes=levelqueue.size();
                for(int i=0;i<currentnodes;i++)
                {
                    TreeNode current=levelqueue.poll();
                    if(current.right!=null)
                       levelqueue.add(current.right);
                     	
                    if(current.left!=null)
                       levelqueue.add(current.left);
                }
            }
            
        }
        return result;
    }
   
}
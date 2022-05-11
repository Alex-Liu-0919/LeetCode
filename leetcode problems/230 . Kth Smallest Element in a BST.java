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
    public int kthSmallest(TreeNode root, int k) {
        
     List<Integer> res = inorder(root);
        
        return res.get(k-1);
        
        // inorder
        
        
    }
    
    private List<Integer> inorder(TreeNode node)
    {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        TreeNode curr = node;

        while(!stack.isEmpty()|| curr!=null)
        {
            if(curr!=null)
            {
            stack.push(curr);
            curr=curr.left;
            }else{
                curr = stack.pop();
                list.add(curr.val);
                curr = curr.right;
            }
            
        }
        return list;
        
    }
}

// traversal all nodes by Inorder-> put all val in a list in order->get the Kth(1-index) smallest value

// this solutuion is not the best, we can optimize it 

// traversal to the Kth(1-index) node   k-1
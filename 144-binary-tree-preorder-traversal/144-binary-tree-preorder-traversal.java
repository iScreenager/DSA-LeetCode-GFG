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
    public List<Integer> preorderTraversal(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            if(root == null){
                    return list;
            }
            
            Stack<TreeNode> st = new Stack<>();
            st.push(root);
            
            while(st.size() > 0){
                    TreeNode top = st.peek();
                     list.add(top.val);
                    st.pop();
                    
                    if(top.right != null){
                            st.push(top.right);
                    }
                    
                    if(top.left != null){
                            st.push(top.left);
                    }
                    
            }
          return list;  
        
    }
}
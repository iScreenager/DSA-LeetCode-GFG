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
    public List<List<Integer>> levelOrder(TreeNode root) {
            
             Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> ls = new LinkedList<List<Integer>>(); 
            
             if(root == null) return ls;
            
            q.offer(root);
           
            
            
            while(q.size() > 0){
                  List<Integer> lc = new LinkedList<Integer>();
                    int c = q.size();
                    
                    for(int i=0;i<c;i++){
                           if(q.peek().left != null) q.offer(q.peek().left);
                             if(q.peek().right != null) q.offer(q.peek().right);
                            lc.add(q.peek().val);
                            q.poll();
                            
                    
                    }
                    ls.add(lc);
            }
            return ls;
            
            
            
            
        
    }
}
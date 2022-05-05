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
                           TreeNode node = q.poll();
                            lc.add(node.val);
                            
                            if(node.left != null) q.offer(node.left);
                            if(node.right != null) q.offer(node.right);
                    
                    }
                    ls.add(lc);
            }
            return ls;
            
            
            
            
        
    }
}
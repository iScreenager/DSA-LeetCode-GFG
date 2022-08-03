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
    public int maxDepth(TreeNode root) {
            
            if(root == null) return 0;
            Queue<TreeNode> que = new LinkedList<>();
            int depth=0;
            que.offer(root);
            while(que.size() > 0){
                    int n = que.size();
            for(int i=0;i<n;i++){
                    TreeNode node = que.poll();
                    
                    if(node.left != null) que.add(node.left);
                    if(node.right != null) que.add(node.right);
            }
            depth++;
            }
            return depth;
        
    }
}
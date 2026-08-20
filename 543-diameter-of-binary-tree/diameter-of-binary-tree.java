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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        FH(root);
        return dia;
    }
    private int FH(TreeNode root){
        if(root==null) return 0;
        int l=FH(root.left);
        int r=FH(root.right);
        dia=Math.max(dia,l+r);
        return 1+Math.max(l,r);
    }
}
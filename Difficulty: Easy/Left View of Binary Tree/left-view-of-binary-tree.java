/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    ArrayList<Integer> leftView(Node root) {
        solve(root, 0);
        return ans;
    }
    void solve(Node root, int level) {
        if (root == null)
            return;

        if (level == ans.size())
            ans.add(root.data);
        solve(root.left, level + 1);
        solve(root.right, level + 1);
    }
}
/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node f = head;
        Node s = head;
        for (int i = 0; i < k; i++) {
            if (f == null) {
                return -1;
            }
            f = f.next;
        }
        while (f != null) {
            f = f.next;
            s = s.next;
        }
        return s.data;
    }
}
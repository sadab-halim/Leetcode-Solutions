class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode a = head;
        ListNode b = head;
        ListNode kthNode;
        
        for(int i = 1; i < k; i++) {
            a = a.next;
        }
        kthNode = a;
        a = a.next;
        while (a != null) {
            a = a.next;
            b = b.next;
        }
        
        int temp = kthNode.val;
        kthNode.val = b.val;
        b.val = temp;
        
        return head;
    }
}
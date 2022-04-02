public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        if(curr==null || curr.next==null){
            return curr;
        }
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
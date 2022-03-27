public boolean hasCycle(ListNode head) {
        ListNode shortPointer = head;
        ListNode longPointer = head;
        
        while(longPointer!=null){
            shortPointer = shortPointer.next;
            if(longPointer.next==null){
                return false;
            }
            longPointer = longPointer.next.next;
            if(shortPointer == longPointer){
                return true;
            }
        }
        
        return false;
    }
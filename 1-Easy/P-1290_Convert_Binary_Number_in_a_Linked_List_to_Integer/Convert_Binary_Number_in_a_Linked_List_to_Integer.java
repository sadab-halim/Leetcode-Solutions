public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        String s= "";
        
        if(head==null)
            return 0;
        
		while(head!=null){
            sb.append(head.val);
            head = head.next;
        }
		s = sb.toString();
        return Integer.parseInt(s,2);
    }
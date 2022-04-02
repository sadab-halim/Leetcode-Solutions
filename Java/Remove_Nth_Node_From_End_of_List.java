public ListNode removeNthFromEnd(ListNode head, int n) {
    int size=1;
    ListNode temp=head;
    while(temp.next!=null){
        temp=temp.next;
        size++;
    }        

    size=size-n;
    temp=head;


    for(int i=0;i<size-1;i++){
        temp=temp.next;
    }
    if(size==0){
        temp=temp.next;
        head=temp;
        return head;
    }

    temp.next=temp.next.next;
    return head;
}
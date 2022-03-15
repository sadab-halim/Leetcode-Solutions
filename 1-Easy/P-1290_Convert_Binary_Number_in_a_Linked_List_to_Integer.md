## [Convert Binary Number in a Linked List to Integer](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

*Example-1* <br/>
*Input:* head = [1,0,1] <br/>
*Output:* 5 <br/>
*Explanation:* (101) in base 2 = (5) in base 10 <br/>

*Example-2* <br/>
*Input:* head = [0] <br/>
*Output:* 0 <br/>

### Solution
```
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
```
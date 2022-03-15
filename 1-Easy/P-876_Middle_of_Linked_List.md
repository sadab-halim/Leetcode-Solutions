## [Middle of Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

*Example-1* <br/>
*Input:* head = [1,2,3,4,5] <br/>
*Output:* [3,4,5] <br/>
*Explanation:* The middle node of the list is node 3. <br/>

*Example-2* <br/>
*Input:* head = [1,2,3,4,5,6] <br/>
*Output:* [4,5,6] <br/>
*Explanation:* Since the list has two middle nodes with values 3 and 4, we return the second one. <br/>

### Solution
```
public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
```
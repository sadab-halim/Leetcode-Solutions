## [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)

*Example-1:

*Input:* <br/>
["MyQueue", "push", "push", "peek", "pop", "empty"] <br/>
[[], [1], [2], [], [], []] <br/>
*Output:* <br/>
[null, null, null, 1, 1, false] <br/>

*Explanation* <br/>
MyQueue myQueue = new MyQueue(); <br/>
myQueue.push(1); // queue is: [1] <br/>
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue) <br/>
myQueue.peek(); // return 1 <br/>
myQueue.pop(); // return 1, queue is [2] <br/>
myQueue.empty(); // return false <br/>

### Solution
```
class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    
    public void push(int x) {
        Stack<Integer> st2 = new Stack<>();
        
        while(!st1.empty())
            st2.push(st1.pop());
        
        st1.push(x);
        while(!st2.empty())
            st1.push(st2.pop());
    }
    
    public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.empty();
    }
}
```
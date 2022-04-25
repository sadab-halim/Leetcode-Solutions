class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> st = new LinkedList<>();
        
        for(String val:ops) {
            if("+".equals(val)) {
                int op1 = st.pop();
                int op2 = op1 + st.peek();
                st.push(op1);
                st.push(op2);
            } else if("C".equals(val)) {
                st.pop();
            } else if("D".equals(val)) {
                st.push(2*st.peek());
            } else {
                st.push(Integer.parseInt(val));
            }
        }
        
        int res=0;
        while(!st.isEmpty())
            res+=st.pop();
        return res;
    }
}
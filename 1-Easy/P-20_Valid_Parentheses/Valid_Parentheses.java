  public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')')
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                    continue;
                }else{
                    return false;
                }
            else if(ch=='}')
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                    continue;
                }else{
                    return false;
                } 
            else if(ch==']')
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                    continue;
                }else{
                    return false;
                }
            else{
                st.push(ch);
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
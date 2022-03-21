public String reverseWords(String s) {
        Stack<Character> str=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' '){
                str.push(c);
            }
            else{
                while(!str.isEmpty()){
                    sb.append(str.pop());
                }
                sb.append(" ");
            }
        }
        while(!str.isEmpty()){
            sb.append(str.pop());
        }
        
        return sb.toString();
    }
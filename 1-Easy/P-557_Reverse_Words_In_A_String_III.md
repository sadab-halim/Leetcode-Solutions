## [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string-iii/)

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

*Example-1:* <br/>
*Input:* s = "Let's take LeetCode contest" <br/>
*Output:* "s'teL ekat edoCteeL tsetnoc" <br/>

*Example-2:* <br/>
*Input:* s = "God Ding" <br/>
*Output:* "doG gniD" <br/>

### Solution
```
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
```
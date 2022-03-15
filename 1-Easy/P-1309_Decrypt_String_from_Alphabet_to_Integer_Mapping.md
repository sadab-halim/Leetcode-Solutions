## [Decrypt String from Alphabet to Integer Mapping](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/)

You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows: <br/>
- Characters ('a' to 'i') are represented by ('1' to '9') respectively.
- Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.

Return the string formed after mapping.

*Example-1* <br/>
*Input:* s = "10#11#12" <br/>
*Output:* "jkab" <br/>
*Explanation:* "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2". <br/>

*Example-2* <br/>
*Input:* s = "1326#" <br/>
*Output:* "acz" <br/>

### Solution
```
public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =s.length()-1; i>=0; i--){
        if(s.charAt(i)=='#'){
            int a = s.charAt(i-2)-'0';
            int b = s.charAt(i-1)-'0';
            int c = a*10+b;
            sb.append((char)('a'+c-1));
            i -=2;
        }
        else{
            int a = s.charAt(i)-'0';
            sb.append((char)('a'+a-1));
        }
    }
      return sb.reverse().toString();
    }
```
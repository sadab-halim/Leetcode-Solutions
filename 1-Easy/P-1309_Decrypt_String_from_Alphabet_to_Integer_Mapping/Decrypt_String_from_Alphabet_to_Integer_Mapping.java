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
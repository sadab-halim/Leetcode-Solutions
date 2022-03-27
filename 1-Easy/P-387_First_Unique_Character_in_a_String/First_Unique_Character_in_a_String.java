public int firstUniqChar(String s) {
        int len = s.length();
        
        for(int i=0; i<len; i++){
            char c = s.charAt(i);
            
            if(s.indexOf(c) == s.lastIndexOf(c))
                return i;
        }
        return -1;
    }
class Solution {
    public boolean backspaceCompare(String s, String t) {
        s=remove(s);
        t=remove(t);
        return (s.equals(t));
    }

    public String remove(String str){
        int backspace=0;
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--) {
            if(str.charAt(i)=='#')
                backspace++;
            else if(backspace>0)
                backspace--;
            else
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
class Solution {
    public boolean isValid(String s) {
        char[] srt=new char[s.length()];
        int top=-1;

        for(char c:s.toCharArray()){
            if (c=='(' || c=='[' || c=='{') 
                srt[++top]=c;
            else{
                if(top==-1) return false;
                
                char x=srt[top--];
                if(c==')' && x!='(' || c==']'&&x!='[' || c=='}'&&x!='{')
                    return false;
            }
        }
        return top==-1;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.equals("") || s.equals(t))return true;
        if (t.equals("") || s.length()>t.length())return false;
        if (s.length()==t.length()) {
            return s.equals(t);
        }
        int sp1=0,tp1=0,sp2=s.length()-1,tp2=t.length()-1;
        char TS=0,SS=0,TE=0,SE=0;
        while (tp2>=tp1 && sp2>=sp1){
            TS=t.charAt(tp1);
            SS=s.charAt(sp1);
            if(TS==SS)sp1++;
            if(sp1>sp2)return true;
            tp1++;
            if (tp2<tp1) break;
            TE=t.charAt(tp2);
            SE=s.charAt(sp2);
            if(TE==SE)sp2--;
            if(sp1>sp2)return true;
            tp2--;  
        }
        return sp1>sp2;
    }
}
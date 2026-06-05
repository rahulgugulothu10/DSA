class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        String lps=s.substring(0, 1); 
        
        for(int i=1;i<s.length();i++){
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            String pal=s.substring(l+1,r);
            if(pal.length()>lps.length()){
                lps=pal;
            }
            
            l=i-1;
            r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            pal=s.substring(l+1,r);
            if(pal.length()>lps.length()){
                lps=pal;
            }
            
        }
        return lps;
    }
}

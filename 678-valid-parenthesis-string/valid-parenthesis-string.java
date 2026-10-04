class Solution {
    public boolean checkValidString(String s) {
        int l=0;
        int h=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                l++;
                h++;
            }
            else if(ch==')'){
                l--;
                h--;
            }
            else{
                l--;
                h++;}
                if(h<0){
                    return false;
                }
                if(l<0){
                    l=0;
                }
            }
        
        return l==0;
    }
}
class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=2;i<=n;i++){
            int cnt=1;
            String ns="";
            for(int j=1;j<res.length();j++){
                if(res.charAt(j)==res.charAt(j-1)){
                    cnt++;
                }
                else{
                    ns+=cnt+""+res.charAt(j-1);
                    cnt=1;
                }
            }
            ns+=cnt+""+res.charAt(res.length()-1);
            res=ns;
        }
        return res.toString();
    }
}
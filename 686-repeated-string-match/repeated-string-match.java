class Solution {
    public int repeatedStringMatch(String a, String b) {
        int cnt=0;
        String s="";
        while(s.length()<b.length()){
            s+=a;
            cnt++;
        }
        if(s.contains(b)){
            return cnt;
        }
        s+=a;
        cnt++;
        if(s.contains(b)){
            return cnt;
        }
        return -1;
        }
    }

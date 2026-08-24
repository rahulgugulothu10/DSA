class Solution {
    public int numRabbits(int[] answers) {
        int[] frq=new int[1000];
        for(int n:answers){
            frq[n]++;
        }
        
        int tot=0;
    for(int x=0;x<frq.length;x++){
        if(frq[x]==0){
            continue;
        }
    
            int gs=x+1;
            int cnt=frq[x];
            int g=(cnt+gs-1)/gs;
            tot+=(g*gs);
        
    }
        return tot;
    }
}
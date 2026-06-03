class Solution {
    public int earliestFinishTime(int[] lst, int[] ld, int[] wst, int[] wd) {
        int fl=Integer.MAX_VALUE;
        for(int i=0;i<lst.length;i++){
            fl=Math.min(fl,lst[i]+ld[i]);
        }
        int fw=Integer.MAX_VALUE;
        for(int j=0;j<wst.length;j++){
            fw=Math.min(fw,wst[j]+wd[j]);
    }
    int mfl=Integer.MAX_VALUE;
    for(int j=0;j<wst.length;j++){
        mfl=Math.min(mfl,Math.max(wst[j],fl)+wd[j]);
    }
    int mfw=Integer.MAX_VALUE;
    for(int i=0;i<lst.length;i++){
        mfw=Math.min(mfw,Math.max(lst[i],fw)+ld[i]);
    }
    return Math.min(mfl,mfw);
    }
}
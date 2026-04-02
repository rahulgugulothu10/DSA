class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        int sum2=0;
       for(int ele:aliceSizes){
        sum1+=ele;
       } 
       for(int ele:bobSizes){
        sum2+=ele;
       }
       int diff=(sum1-sum2)/2;
       for(int i=0;i<aliceSizes.length;i++){
        for(int j=0;j<bobSizes.length;j++){
            if(aliceSizes[i]==bobSizes[j]+diff){
                return new int[]{aliceSizes[i],bobSizes[j]};
            }
        }
       }
       return new int[]{-1,-1};
    }
}
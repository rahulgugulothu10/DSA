class Solution {
    public int maximumProduct(int[] nums) {
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
     for(int n:nums){

        if(max1<n){
            max3=max2;
            max2=max1;
            max1=n;
        }
        else if(max2<n){
            max3=max2;
            max2=n;
        }
        else if(max3<n){
            max3=n;
        }
        if(min1>n){
            min2=min1;
            min1=n;
        }
        else if(min2>n){
            min2=n;
        }
       
     }
     return Math.max(max1*max2*max3,min1*min2*max1);


    }
}
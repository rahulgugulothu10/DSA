class Solution {
    public int[] corpFlightBookings(int[][] b, int n) {
        int[]  arr=new int[n];
       
        for(int i=0;i<b.length;i++){
            int st=b[i][0];
            int en=b[i][1];
            int s=b[i][2];
            for(int j=st-1;j<en;j++){
                arr[j]+=s;
            }

        }
        return arr;
    }
}
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
       if(start>destination){
        int temp=start;
        start=destination;
        destination=temp;
       }
       int csum=0;
       int ctot=0;
        for(int i=0;i<distance.length;i++){
                  if(i>=start && i<destination){
                    csum+=distance[i];
                  }
                  ctot+=distance[i];
        }
        int res=ctot-csum;
        return Math.min(csum,res);

    }
}
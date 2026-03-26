class Solution {
    public int hIndex(int[] arr) {
        Arrays.sort(arr);
        int cnt=0;
      int l=0;
      int r=arr.length-1;
      while(l<r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]>=i+1){
            cnt++;
        }
        else{
            break;
        }
    }
    return cnt;
}
}
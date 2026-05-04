

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n - k; i++) {
            temp.add(nums[i]);
        }
        for (int i = n - k; i < n; i++) {
            nums[i - (n - k)] = nums[i];
        }
        for (int i = 0; i < temp.size(); i++) {
            nums[k + i] = temp.get(i);
        }
    }
}

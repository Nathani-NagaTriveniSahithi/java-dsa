class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0;
        int first = i,second = i + n;
        for(i = 0;i < 2 * n;i += 2){
            ans[i] = nums[first];
            ans[i + 1] = nums[second];
            first++;
            second++;

        }
        return ans;
        
    }
}
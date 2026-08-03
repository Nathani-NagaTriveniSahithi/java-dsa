class Solution {
    public int[] runningSum(int[] nums) {
        int[] running = new int[nums.length];
        int i,j;
        for(i = 0;i < nums.length;i++){
            int sum = 0;
            for(j = i;j >= 0;j--){
                sum = sum + nums[j];

            }
            running[i] = sum;
        }
        return running;

        
    }
}
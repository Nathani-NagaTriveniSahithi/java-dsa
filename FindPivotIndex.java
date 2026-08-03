class Solution {
    public int pivotIndex(int[] nums) {
        int[] sumleft = new int[nums.length];
        int[] sumright = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            int left = 0,right = 0;
            for(int k = i - 1;k >= 0;k--)
                left += nums[k];
            sumleft[i] = left;
            for(int j = i + 1; j < nums.length;j++)
                right += nums[j];
            sumright[i] = right;
        }
        for(int i = 0;i < nums.length;i++){
            if(sumleft[i] == sumright[i])
                return i;
        }
        return -1;
        
    }
}
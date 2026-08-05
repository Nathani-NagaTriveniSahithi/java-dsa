package BinarySearch;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        while(first <= last){
            int mid = first + (last - first) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                first = mid + 1;
            else
                last = mid - 1;
        }
        for(int i = 0;i < nums.length - 1;i++){
            if(target > nums[i] && target < nums[i + 1])
                return i + 1;
        }
        if(target < nums[0])
            return 0;

        return nums.length;

    }
}
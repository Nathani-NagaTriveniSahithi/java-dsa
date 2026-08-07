package BinarySearch;

public class FirstandLastPositionofElementinSortedArray {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = findindex(nums,target,true);
        if(ans[0] != -1){
            ans[1] = findindex(nums,target,false);
        }
        return ans;
    }
    int findindex(int[] nums,int target,boolean searchingFirstIndex){
        int first = 0;
        int last = nums.length -1;
        int ans = -1;
        while(first <= last){
            int mid = first + (last - first) / 2;
            if(nums[mid] == target){
                ans = mid;
                if(searchingFirstIndex)
                    last = mid - 1;
                else
                    first = mid + 1;
            }
            else if(nums[mid] < target)
                first = mid + 1;
            else
                last = mid - 1;
        }
        return ans;
    }
}
    
}

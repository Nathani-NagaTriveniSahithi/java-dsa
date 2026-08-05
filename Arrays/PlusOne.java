class Solution {
    public int[] plusOne(int[] digits) {
        int[] ans = new int[digits.length + 1];
        for(int i = digits.length -1;i >= 0;i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            else if(digits[i] == 9){
                digits[i] = 0;
            }
        }
        ans[0] = 1;
        for(int i = 1;i < ans.length;i++){
            ans[i] = 0;
        }
        return ans;
    }
}
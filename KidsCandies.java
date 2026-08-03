class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
        int max = candies[0];
        for(int i = 1;i < candies.length;i++){
            if(max < candies[i])
                max = candies[i];
        }
        for(int i = 0; i < candies.length;i++){
            if(candies[i] + extraCandies >= max)
                ans.add(true);
            else
                ans.add(false);
        }
        return ans;
    }
}
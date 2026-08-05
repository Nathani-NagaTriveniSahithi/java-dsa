package Arrays;
class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0,max,i;
        for(i = 1;i < prices.length;i++){
            if(prices[i] < min)
                min = prices[i];
            max = prices[i] - min;
            if(max > profit)
                profit = max;
        }
        return profit;
    }
}
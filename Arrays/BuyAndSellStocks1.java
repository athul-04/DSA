class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int mini=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]-mini>profit){
                profit=prices[i]-mini;
            }
            mini=Math.min(mini,prices[i]);
        }

        return profit;
        
    }
}
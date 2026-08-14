class Solution {
    public int maxProfit(int[] prices) {
        
     int profit=0;
        int bestbuy=prices[0];
        for(int i=1;i<prices.length;i++){
            int currprice=prices[i];
            if(currprice>bestbuy){
                profit=Math.max(profit,currprice-bestbuy);

            }
            bestbuy=Math.min(bestbuy,currprice);
        
    }
    return profit;
    }
}
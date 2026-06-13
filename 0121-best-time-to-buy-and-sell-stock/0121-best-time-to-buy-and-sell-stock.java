class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int lowprice=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<lowprice){
                lowprice=prices[i];
            }else{
                int profit=prices[i]-lowprice;
                maxprofit=Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
    }
}
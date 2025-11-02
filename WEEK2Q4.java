class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // to store the minimum price so far
        int maxProfit = 0;                // to store the maximum profit

        for (int price : prices) {
            // update minimum price if current price is smaller
            if (price < minPrice) {
                minPrice = price;
            }
            // check if selling today gives a better profit
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}

package LeetCode;

public class Selling_BuyingStocks {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        Selling_BuyingStocks s = new Selling_BuyingStocks();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(s.maxProfit(prices));
    }
}

package DS_04_Array_and_Strings.Arrays_and_Questions;

public class StockBuyAndSell2 {
    // Question 4 : Stock Buy and Sell (part - 2 : buy any number of stock)
    // leetcode link :
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

    public int maxProfit(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit = profit + arr[i] - arr[i - 1];
            }
        }
        return profit;
    }

}

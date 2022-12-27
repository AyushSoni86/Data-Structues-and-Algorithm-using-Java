package DS_04_Array_and_Strings.Arrays_and_Questions;

public class StockBuyAndSell1 {
    // Question 3 : Stock Buy and Sell (part - 1 : one stock at a time)
    // leetcode link :
    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

    public int maxProfit(int[] arr) {
        int max = 0;
        int minSoFar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            max = Math.max(max, profit);
        }
        return max;
    }

}

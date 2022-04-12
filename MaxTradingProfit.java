public class MaxTradingProfit {

    public static void main(String[] args) {
        int[] stockPrices = { 7, 15, 2, 3, 4, 5, 9, 13 };
        int maxProfit = new MaxTradingProfit().maxProfit(stockPrices);
        Print.printLine("maxProfit: " + maxProfit);
    }

    private int maxProfit(int[] stockPrices) {
        int maxProfit = 0;
        int minValue = stockPrices[0];
        
        for (int i : stockPrices) {
            minValue = Math.min(minValue, i);
            maxProfit = Math.max(maxProfit, i - minValue);
        }
        return maxProfit;
    }
}

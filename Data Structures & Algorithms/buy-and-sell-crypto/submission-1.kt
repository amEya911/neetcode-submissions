class Solution {
    fun maxProfit(prices: IntArray): Int {

        var left = 0
        var right = 1
        var result = 0

        while (right < prices.size) {
            if (prices[left] < prices[right]) {
                val profit = prices[right] - prices[left]
                result = maxOf(result, profit)
            } else {
                left = right
            }
            right++

        }
        return result
    }
}

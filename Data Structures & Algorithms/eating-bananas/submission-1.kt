class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()

        var result = right

        while (left <= right) {
            val middle = left + (right - left) / 2

            var hours = 0L

            for (p in piles) {
                hours += (p.toLong() + middle - 1) / middle
            }

            if (hours <= h.toLong()) {
                result = middle
                right = middle - 1
            } else {
                left = middle + 1
            }
        }

        return result
    }
}
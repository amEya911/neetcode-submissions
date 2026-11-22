class Solution {
    fun maxArea(heights: IntArray): Int {
        var left = 0
        var right = heights.size - 1
        var result = 0

        while (left < right) {

            val length = minOf(heights[left], heights[right])
            val width = right - left

            val area = length * width

            result = maxOf(result, area)

            if (heights[left] > heights[right]) {
                right--
            } else {
                left++
            }
        }
        return result
    }
}

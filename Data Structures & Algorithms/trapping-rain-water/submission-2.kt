class Solution {
    fun trap(height: IntArray): Int {
        val leftMax = IntArray(height.size)
        val rightMax = IntArray(height.size)

        // Calculate maximum height from the left
        leftMax[0] = height[0]

        for (i in 1 until height.size) {
            leftMax[i] = maxOf(leftMax[i - 1], height[i])
        }

        // Calculate maximum height from the right
        rightMax[height.size - 1] = height[height.size - 1]

        for (i in height.size - 2 downTo 0) {
            rightMax[i] = maxOf(rightMax[i + 1], height[i])
        }

        // Calculate trapped water
        var result = 0

        for (i in height.indices) {
            val water = minOf(leftMax[i], rightMax[i]) - height[i]
            result += water
        }

        return result
    }
}

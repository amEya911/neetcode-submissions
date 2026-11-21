class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val set = nums.toSet()
        var output = 0

        for (num in set) {
            if (num - 1 !in set) {
                var currentNumber = num
                var length = 1

                while (currentNumber + 1 in set) {
                    currentNumber++
                    length++
                }

                output = maxOf(output, length)
            }
        }

        return output
    }
}

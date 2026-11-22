class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = mutableListOf<List<Int>>()

        for (i in nums.indices) {
            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) continue

            var left = i + 1
            var right = nums.size - 1

            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]

                if (sum == 0) {
                    result.add(listOf(nums[i], nums[left], nums[right]))

                    left++
                    right--

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--
                    }
                } else if (sum < 0) {
                    left++
                } else {
                    right--
                }
            }
        }

        return result
    }
}
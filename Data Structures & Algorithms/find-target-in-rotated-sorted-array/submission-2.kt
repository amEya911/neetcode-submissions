
class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val middle = left + (right - left) / 2

            if (nums[middle] == target) {
                return middle
            }

            // Left half is sorted
            if (nums[left] <= nums[middle]) {
                if (nums[left] <= target && target < nums[middle]) {
                    right = middle - 1
                } else {
                    left = middle + 1
                }
            }

            // Right half is sorted
            else {
                if (nums[middle] < target && target <= nums[right]) {
                    left = middle + 1
                } else {
                    right = middle - 1
                }
            }
        }
        return -1
    }
}

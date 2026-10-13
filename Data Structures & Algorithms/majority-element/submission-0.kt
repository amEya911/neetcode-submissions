class Solution {
    fun majorityElement(nums: IntArray): Int {

        val map = hashMapOf<Int, Int>()

        for (num in nums) {

            map[num] = (map[num] ?: 0) + 1

            if (map[num]!! > nums.size / 2) {
                return num
            }
        }

        return -1

    }
}

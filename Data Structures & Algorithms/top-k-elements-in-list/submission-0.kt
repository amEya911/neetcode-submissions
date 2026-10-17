class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        val map = hashMapOf<Int, Int>()

        for (num in nums) {
            map[num] = (map[num] ?: 0) + 1
        }

        val sorted = map.keys.sortedByDescending { map[it] }

        return sorted.take(k).toIntArray()
    }
}

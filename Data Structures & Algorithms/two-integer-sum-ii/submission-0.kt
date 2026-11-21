class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()

        for (i in numbers.indices) {
            val required = target - numbers[i]

            if (map.containsKey(required)) {
                return intArrayOf(map[required]!!+1, i+1)
            } else {
                map[numbers[i]] = i
            }
        }
        return intArrayOf()
    }
}

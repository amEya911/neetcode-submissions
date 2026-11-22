class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var right = 0
        var result = 0

        val set = HashSet<Char>()

        while (right < s.length) {
            if (!set.contains(s[right])) {
                set.add(s[right])
                result = maxOf(result, set.size)
                right++
            } else {
                set.remove(s[left])
                left++
            }
        }

        return result
    }
}
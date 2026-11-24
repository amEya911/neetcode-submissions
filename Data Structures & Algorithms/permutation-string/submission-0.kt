class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        // If s1 is longer, no permutation can fit
        if (s1.length > s2.length) return false

        // Store character frequencies
        val s1Count = IntArray(26)
        val windowCount = IntArray(26)

        // Count characters in s1 and the first window of s2
        for (i in s1.indices) {
            s1Count[s1[i] - 'a']++
            windowCount[s2[i] - 'a']++
        }

        // Slide the fixed-size window
        for (right in s1.length until s2.length) {

            // Check if current window matches s1
            if (s1Count.contentEquals(windowCount)) {
                return true
            }

            // Add the incoming character
            windowCount[s2[right] - 'a']++

            // Remove the outgoing character
            windowCount[s2[right - s1.length] - 'a']--
        }

        // Check the final window
        return s1Count.contentEquals(windowCount)
    }
}
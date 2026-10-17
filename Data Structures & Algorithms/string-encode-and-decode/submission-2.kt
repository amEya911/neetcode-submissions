class Solution {

    fun encode(strs: List<String>): String {
        val result = StringBuilder()

        for (str in strs) {
            result.append(str.length)
            result.append("#")
            result.append(str)
        }

        return result.toString()
    }

    

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0

        while (i < str.length) {
            var j = i

            // Find the separator after the length
            while (str[j] != '#') {
                j++
            }

            // Read the entire length, even if it has multiple digits
            val number = str.substring(i, j).toInt()

            // Extract the original string
            val start = j + 1
            val end = start + number

            result.add(str.substring(start, end))

            // Skip the decoded string and move to the next length
            i = end
        }

        return result
    }


}

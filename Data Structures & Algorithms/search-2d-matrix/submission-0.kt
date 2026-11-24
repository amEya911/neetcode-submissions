class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        return search(0, matrix.size - 1, target, matrix)
    }
}

private fun search(
    left: Int,
    right: Int,
    target: Int,
    matrix: Array<IntArray>
): Boolean {

    if (left > right) return false

    val middle = left + (right - left) / 2

    return if (target < matrix[middle][0]) {
        search(left, middle - 1, target, matrix)

    } else if (target > matrix[middle][matrix[middle].size - 1]) {
        search(middle + 1, right, target, matrix)

    } else {
        binarySearch(
            0,
            matrix[middle].size - 1,
            target,
            matrix[middle]
        )
    }
}

private fun binarySearch(
    left: Int,
    right: Int,
    target: Int,
    array: IntArray
): Boolean {

    if (left > right) return false

    val middle = left + (right - left) / 2

    return when {
        array[middle] == target -> true

        array[middle] > target ->
            binarySearch(left, middle - 1, target, array)

        else ->
            binarySearch(middle + 1, right, target, array)
    }
}
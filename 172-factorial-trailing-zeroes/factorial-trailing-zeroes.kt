class Solution {
    fun trailingZeroes(n: Int): Int {
        var count = 0
        var divisor = 5
        var current = n
        while (current / divisor > 0) {
            count += current / divisor
            divisor *= 5
        }
        return count
    }
}
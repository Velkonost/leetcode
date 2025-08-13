class Solution {
    // Complexity:
    // Time O(Log n) and Space O(1).
    fun isPowerOfThree(n: Int): Boolean {
        if (n and 1 == 0) {
            return false
        }

        val m = n.toLong()
        var x = 1L
        while (x < m) {
            x += x shl 1
        }
        return x == m
    }
}
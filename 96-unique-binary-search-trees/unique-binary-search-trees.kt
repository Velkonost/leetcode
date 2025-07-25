class Solution {
    fun numTrees(n: Int): Int {
        var res = 1L
        for (i in 0..<n) {
            res = res * (2L * (2 * i + 1)) / (i + 2)
        }
        return res.toInt()
    }
}
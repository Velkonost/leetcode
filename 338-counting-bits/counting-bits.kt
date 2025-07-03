class Solution {
    fun countBits(n: Int): IntArray {
        val res = IntArray(n + 1)
        for (i in 0..n) {
            res[i] = i.toString(2).count { it == '1' }
        }
        return res
    }
}
class Solution {
    fun hammingWeight(n: Int): Int {
        // return n.toString(2).count { it == '1' }
        var res = 0
        var num = n
        repeat(32) {
            if ((num and 1) == 1) {
                res ++
            }
            num = num ushr 1
        }
        return res
    }
}
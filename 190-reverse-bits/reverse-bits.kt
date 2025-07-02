class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        var result = 0
        var num = n
        repeat(32) {
            result = (result shl 1) or (num and 1)
            num = num ushr 1
        }
        return result
    }
}
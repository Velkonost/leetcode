class Solution {
    fun findComplement(num: Int): Int {
        var n = num
        var mask = 0
        while(n != 0) {
            n = n shr 1
            mask = mask shl 1 
            mask = mask or 1
        }
        return num xor mask
    }
}
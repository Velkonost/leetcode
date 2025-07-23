class Solution {
    fun bitwiseComplement(n: Int): Int {
        if (n == 0) return 1
        var num = n
        var mask = 0
        while(num != 0) {
            num = num shr 1
            mask = mask shl 1 
            mask = mask or 1
        }
        return n xor mask
    }
}
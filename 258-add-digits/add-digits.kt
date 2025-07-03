class Solution {
    fun addDigits(num: Int): Int {
        var remain = num
        while(remain >= 10) {
            var digitsSum = 0
            while(remain > 0) {
                val digit = remain % 10
                digitsSum += digit
                remain /= 10
            }
            remain = digitsSum
        }
        return remain

    }
}
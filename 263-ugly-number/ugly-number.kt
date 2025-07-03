class Solution {
    fun isUgly(n: Int): Boolean {
        if (n <= 0) {
            return false
        }
        return n div 2 div 3 div 5 == 1
    }
    
    private infix fun Int.div(dividend: Int): Int {
        var num = this
        while (num % dividend == 0) {
            num /= dividend
        }
        return num
    }
}
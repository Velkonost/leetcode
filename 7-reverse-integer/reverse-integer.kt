class Solution {
    fun reverse(x: Int): Int {
        var res = 0L
        var n = abs(x.toLong())
        while(n != 0L) {
            res = res * 10 + (n % 10)
            n /= 10
        }

        if (res >= Int.MAX_VALUE) return 0

        return if (x < 0) -res.toInt() else res.toInt()
    }
}
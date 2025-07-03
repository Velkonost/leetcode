class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        if (num == 1) return true
        find(num)?.let { i ->
           return true
        }
        return false
        
    }

    fun find(n: Int): Int? {
        var left = 1
        var right = minOf(n / 2, 46340)

        while (left <= right) {
            val mid = left + (right - left) / 2
            val sqr = mid * mid
            if (sqr == n) return mid
            else if (sqr < n) left = mid + 1
            else right = mid - 1
        }

        return null
    }
}
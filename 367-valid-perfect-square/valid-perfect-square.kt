class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        if (num == 1) return true
        find(num)?.let { i ->
           return true
        }
        return false
        
    }

    fun find(n: Int): Int? {
        for (i in 1..n/2) {
            if (n % i == 0 && n / i == i) return i
        }
        return null
    }
}
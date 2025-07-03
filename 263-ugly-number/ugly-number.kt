class Solution {
    fun isUgly(n: Int): Boolean {
        if (n == 1) return true
        val factors = setOf(2, 3, 5)
        var number = n

        for (factor in factors) {
            while (number != 0 && number % factor == 0) {
                number /= factor
            }
        }

        return number == 1
    }
}
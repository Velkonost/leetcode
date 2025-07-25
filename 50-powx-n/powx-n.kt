class Solution {
    fun myPow(x: Double, n: Int): Double {
        val signBiasX = if (n < 0) 1.0 / x else x
        return exponent(signBiasX, abs(n))
    }

    private fun exponent(base: Double, exp: Int): Double {
        return when (exp) {
            0 -> 1.0
            1 -> base
            else -> {
                val res = exponent(base, exp / 2)
                if (exp % 2 == 0) {
                    res * res
                } else {
                    base * res * res
                }
            }
        }
    }
}
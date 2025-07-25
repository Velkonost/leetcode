class Solution {
    fun fractionToDecimal(numerator: Int, denominator: Int): String {
        // Test cases:
        // 4 / 333
        // 1 / 6
        // -7 / 12
        // -1 / -2147483648
        val result = StringBuilder()

        // Calculate the sign
        if (numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) {
            result.append("-")
        }

        // Calculate the whole number
        val num: Long = abs(numerator.toLong())
        val denom: Long = abs(denominator.toLong())
        result.append(num / denom)

        var remainder = num % denom
        if (remainder == 0L) {
            return result.toString()
        }

        result.append(".")

        // Calculate the fractional part, starting from the first digit after the decial
        remainder *= 10L
        val map = mutableMapOf<Long, Int>()
        while (!map.containsKey(remainder) && remainder != 0L) {
            map.put(remainder, result.length)
            val digit: Int = (remainder / denom).toInt()
            result.append(digit)
            remainder = (remainder % denom) * 10
        }

        if (remainder != 0L) {
            result.insert(map.getOrDefault(remainder, 0), "(")
            result.append(")")
        }

        return result.toString()
    }
}
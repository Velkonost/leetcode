class Solution {
    fun countPrimes(n: Int): Int {
        if (n < 3) return 0
        val np = ByteArray(n)
        var count = n - 2
        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (np[i] > 0) continue
            for (j in i * i until n step i) {
                count -= 1 - np[j]
                np[j] = 1
            }
        }
        return count
    }
}
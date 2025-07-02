class Solution {

    private val MOD = 1000000007L

    fun possibleStringCount(word: String, k: Int): Int {
        val size = word.length

        if (size == 0) return 0

        var added = 1
        val groups = mutableListOf<Int>()

        for (i in 0 until size) {
            if (i > 0) {
                if (word[i] == word[i - 1]) {
                    added++
                } else {
                    groups.add(added)
                    added = 1
                }
            }
        }

        groups.add(added)

        var total = 1L

        for (i in groups) {
            total = (total * i) % MOD
        }

        if (k <= groups.size) {
            return (total % MOD).toInt()
        }

        var dp = IntArray(k)
        dp[0] = 1

        for (i in groups) {
            val newDp = IntArray(k)
            var sum = 0L
            for (j in 0 until k) {
                if (j > 0) {
                    sum = (sum + dp[j - 1]) % MOD
                }
                if (j > i) {
                    sum = (sum - dp[j - i - 1] + MOD) % MOD
                }
                newDp[j] = sum.toInt()
            }
            dp = newDp
        }

        var invalid = 0L
        for (i in groups.size until k) {
            invalid = (invalid + dp[i]) % MOD
        }
        return ((total - invalid + MOD) % MOD).toInt()
    }
}
class Solution {
    fun hIndex(citations: IntArray): Int {
        val n = citations.size
        val count = IntArray(n + 1)
        for (c in citations) {
            if (c >= n) count[n]++
            else count[c] ++
        }

        var total = 0
        for (i in n downTo 0) {
            total += count[i]
            if (total >= i) return i
        }
        return 0

    }
}
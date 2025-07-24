class Solution {
    fun minDeletion(s: String, k: Int): Int {
        val map = s.groupingBy { it }.eachCount().values.sorted()
        val amount = map.size

        if (amount <= k) return 0
        return map.take(amount - k).sum()
    }
}
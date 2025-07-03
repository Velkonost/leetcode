class Solution {
    fun longestPalindrome(s: String): Int {
        val set = hashSetOf<Char>()
        var res = 0
        s.forEach { 
            if (set.contains(it)) {
                res += 2
                set.remove(it)
            } else {
                set.add(it)
            }
        }
        if (set.isNotEmpty()) res += 1
        return res
    }
}
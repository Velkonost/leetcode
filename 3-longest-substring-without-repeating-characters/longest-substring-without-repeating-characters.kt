class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = mutableSetOf<Char>()
        var l = 0
        var n = 0
        var res = 0

        for (r in s.indices) {
            if (!set.contains(s[r])) {
                set.add(s[r])
                res = maxOf(res, r - l + 1)
            } else {
                while(set.contains(s[r])) {
                    set.remove(s[l])
                    l++
                }
                set.add(s[r])
            }
        }

        return res
    }
}
class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (t.length != s.length) return false

        val map = mutableMapOf<Char, Int>()
        for (i in s.indices) {
            map[s[i]] = map.getOrDefault(s[i], 0) + 1
            map[t[i]] = map.getOrDefault(t[i], 0) - 1
        }

        return map.values.all {
            it == 0
        }
    }
}
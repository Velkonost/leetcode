class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val map = hashMapOf<Char, Char>()
        val used = mutableSetOf<Char>()

        for (i in 0 until t.length) {
            if (map.contains(t[i])) {
                if (map[t[i]] != s[i]) return false
            } else {
                if (used.contains(s[i]) ) return false
            }

            map[t[i]] = s[i]
            used.add(s[i])
        }
        return true
    }
}
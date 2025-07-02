class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val sWords = s.split(" ")
        if (sWords.size != pattern.length) return false

        val map = hashMapOf<Char, String>()

        for (i in 0 until pattern.length) {
            val c = pattern[i]
            val w = sWords[i]

            if (map.contains(c)) {
                if (map[c]!! != w) return false
            } else {
                if (map.values.contains(w)) return false
            }

            map[c] = w
            
        }
        return true
    }
}
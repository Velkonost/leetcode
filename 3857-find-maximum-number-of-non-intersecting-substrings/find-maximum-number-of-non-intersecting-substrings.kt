class Solution {
    fun maxSubstrings(word: String): Int {
        var res = 0
        var n = word.length
        val map = hashMapOf<Char, Int>()
        for (i in 0..<n) {
            val c = word[i]
            if (!map.contains(c)) {
                map[c] = i
            } else if (i - map[c]!! + 1 >= 4) {
                res ++
                map.clear()
            }
        }
        return res
    }
}
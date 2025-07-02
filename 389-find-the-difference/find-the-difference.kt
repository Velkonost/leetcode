class Solution {
    fun findTheDifference(s: String, t: String): Char {
        val map = hashMapOf<Char, Int>()

        for (c in 0..t.length - 1) {
            map[t[c]] = map.getOrDefault(t[c], 0) + 1

            s.getOrNull(c)?.let {
                map[it] = map.getOrDefault(it, 0) - 1
            }
        }

        return map.entries.first { it.value == 1 }.key
    }
}

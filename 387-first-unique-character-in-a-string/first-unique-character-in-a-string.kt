class Solution {
      fun firstUniqChar(s: String): Int {
         val map = HashMap<Char, Int>()
        for (i in s.indices) {
            val e = s[i]
            if (map.containsKey(e)) {
                map[e] = Int.MAX_VALUE
            } else map[e] = i
        }
        
        val indices = map.values.sorted()
        if (indices[0] == Int.MAX_VALUE) return -1
        return indices[0]
    }
}
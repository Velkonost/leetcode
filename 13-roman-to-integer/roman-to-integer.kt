class Solution {
    fun romanToInt(s: String): Int {
        return s.foldIndexed(0) { index, sum, c ->
            val value = when(c) {
                'I' -> if ("VX".contains(s.getOrNull(index + 1) ?: ' ')) -1 else 1
                'V' -> 5
                'X' -> if ("LC".contains(s.getOrNull(index + 1) ?: ' ')) -10 else 10
                'L' -> 50
                'C' -> if ("DM".contains(s.getOrNull(index + 1) ?: ' ')) -100 else 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
            value + sum
        }
        
    }
}
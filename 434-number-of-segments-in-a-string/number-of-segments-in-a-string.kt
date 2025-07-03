class Solution {
    fun countSegments(s: String): Int {
        if (s.isEmpty()) return 0
        return s.split(" ").filter { it.isNotBlank() }.size
    }
}
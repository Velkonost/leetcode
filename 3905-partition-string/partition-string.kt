class Solution {
    fun partitionString(s: String): List<String> {
        val set = mutableSetOf<String>()

        var curr = ""
        for (char in s) {
            curr += char
            if (curr !in set) {
                set.add(curr)
                curr = ""
            }
        }

        return set.toList()
    }
}
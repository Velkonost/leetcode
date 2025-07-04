class Solution {
    fun hasMatch(input: String, pattern: String): Boolean {
        val indexSpecial = pattern.indexOf("*")
        val firstPart = input.indexOf(pattern.substring(0, indexSpecial))
        if (firstPart == -1) return false

        val secondPart = input
                        .substring(firstPart + indexSpecial)
                        .indexOf(pattern.substring(indexSpecial + 1))
        return secondPart != -1
    }
}
class Solution {
    fun detectCapitalUse(word: String): Boolean {
        val c = word.filter { it.isUpperCase() }.count()
        return c == word.length || c == 0 || c == 1 && word[0].isUpperCase()
    }
}
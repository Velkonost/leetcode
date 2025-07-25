class Solution {
    fun isPalindrome(x: Int): Boolean {
        val s = x.toString()

        for (i in 0 until s.length / 2) {
            if (s[i] != s[s.length - i - 1]) return false
        }

        return true
    }
}
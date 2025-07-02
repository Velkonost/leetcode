class Solution {
     fun reverseVowels(s: String): String {
        val vowels = setOf('a', 'e', 'i', 'o', 'u')
        var left = 0
        var right = s.length - 1
        val res = s.toMutableList()

        while (left < right) {
            while (vowels.none { it.equals(res[left], true) } && left < right) {
                left++
            }

            while (vowels.none { it.equals(res[right], true) } && left < right) {
                right --
            }

            val temp = res[left]
            res[left++] = res[right]
            res[right--] = temp

        }

        return res.joinToString(separator = "")
    }
}
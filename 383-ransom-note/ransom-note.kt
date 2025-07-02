class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if (magazine.length < ransomNote.length) return false

        val map = hashMapOf<Char, Int>()

        for (i in 0..magazine.length - 1) {
            map[magazine[i]] = map.getOrDefault(magazine[i], 0) + 1

            if (ransomNote.length - 1 >= i) {
                map[ransomNote[i]] = map.getOrDefault(ransomNote[i], 0) - 1
            }
        }

        return map.values.all {
            it >= 0
        }
    }
}
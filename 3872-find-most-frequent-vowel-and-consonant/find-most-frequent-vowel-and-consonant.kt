class Solution {
    fun maxFreqSum(s: String): Int {
        val vowel = setOf('a', 'e', 'i', 'o', 'u')
        val res = s.groupBy { it }
        var vowelMax = 0
        var consonantMax = 0
        res.forEach { (k, v) -> 
            if(k in vowel) {
                vowelMax = maxOf(vowelMax, v.size)
            }else{
                consonantMax = maxOf(consonantMax, v.size)
            }
        }
        return vowelMax + consonantMax
    }
}
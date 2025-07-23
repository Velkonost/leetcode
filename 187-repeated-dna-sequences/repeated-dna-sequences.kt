class Solution {
    fun findRepeatedDnaSequences(s: String): List<String> {
        val res = hashSetOf<String>()
        val met = hashSetOf<String>()

        for (i in 0..s.length - 10) {
            val dna = s.substring(i, i + 10)
            if (met.contains(dna)) res.add(dna)
            met.add(dna)
        }
        return res.toList()
    }
}
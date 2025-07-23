class Solution {
    fun findWords(words: Array<String>): Array<String> {
        val firstRow = "qwertyuiopQWERTYUIOP"
        val secondRow = "asdfghjklASDFGHJKL"
        val thirdRow = "zxcvbnmZXCVBNM"

        var res = mutableListOf<String>()
        words.forEach { w ->
            if (
                w.all { it in firstRow } || w.all { it in secondRow } || w.all { it in thirdRow }
            ) {
                res.add(w)
            }
        }
        return res.toTypedArray()
    }
}
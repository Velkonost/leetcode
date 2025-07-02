class Solution {
    fun convertToTitle(columnNumber: Int): String {
        if (columnNumber <= 0) return ""
        val modulo = 26
        val index = (columnNumber - 1) % modulo

        var char = 'A' + index
        return convertToTitle((columnNumber - index + 1) / modulo) + char
    }
}
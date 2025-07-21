class Solution {
    fun makeFancyString(s: String): String {
        val builder = StringBuilder(s.length)
        var bytes = 0
        for (c in s) {
            val code = c.code
            if (bytes != code shl 16 or code) {
                bytes = bytes shl 16 or code
                builder.append(c)
            }
        }
        return builder.toString()
    }
}
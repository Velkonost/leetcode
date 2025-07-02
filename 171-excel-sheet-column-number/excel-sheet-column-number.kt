class Solution {
    fun titleToNumber(columnTitle: String): Int {
        if (columnTitle == "") return 0
        
        var res = 0
        for (char in columnTitle) {
            val charInt = char - 'A' + 1
            res = res * 26 + charInt
        }
        return res
    }
}
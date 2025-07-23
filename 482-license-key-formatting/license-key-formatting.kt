class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {
        var str = s.filter { it != '-' }.uppercase()
        var group = ""
        var res = ""
        for (i in (str.length - 1) downTo 0) {
            group += str[i]
            if (group.length == k) {
                res += "${group}-"    //"W9E2-" -> "-2E9W"
                group = ""
            }
        }
        if (group.isEmpty()) {
            res = res.dropLast(1)
        } else {
            res += group
        }

        return res.reversed()
    }
}
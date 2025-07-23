class Solution {
    fun convertToBase7(num: Int): String {
        if (num == 0) return "0"
        if (num < 0) return "-${convertToBase7(-num)}"

        var n = num
        var res = ""
        while(n != 0) {
            res += (n % 7).toString()
            n /= 7
        }
        return res.reversed()
    }
}
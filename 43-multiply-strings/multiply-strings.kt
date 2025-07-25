class Solution {
    fun multiply(num1: String, num2: String): String {
    if (num1 == "0" || num2 == "0") return "0"
    
    val num1 = StringBuilder(num1).reversed().toString()
    val num2 = StringBuilder(num2).reversed().toString()
    val len1 = num1.length; val len2 = num2.length
    
    val sums = IntArray(len1 + len2)
    
    for (i in 0..len1 - 1) {
        val a = num1[i] - '0'
        for (j in 0..len2 - 1) {
            val b = num2[j] - '0'
            sums[i + j] += a * b
        }
    }

    val res = StringBuilder()
    var carry = 0
    
    for (sum in sums) {
        val num = (sum + carry) % 10
        carry = (sum + carry) / 10
        res.append(num)
    }

    if (res.last() == '0') res.deleteCharAt(res.length - 1)
    return res.reversed().toString()
}
}
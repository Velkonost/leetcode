class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        var sumOfDiv = 0
        for (i in 1..num/2) {
            if (num % i == 0) sumOfDiv += i
        }
        return sumOfDiv == num
    }
}
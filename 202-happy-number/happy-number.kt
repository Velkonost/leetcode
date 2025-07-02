class Solution {
    fun isHappy(n: Int): Boolean {
        if (n == 1) return true
        else if (n == 4) return false

        var sum = 0
        var number = n

        while(number > 0) {
            val digit = number % 10
            sum += digit * digit

            number /= 10
        }
        
        return isHappy(sum)

    }
}
class Solution {
    fun checkPrimeFrequency(nums: IntArray): Boolean {

        val map = hashMapOf<Int, Int>()
        for (n in nums) {
            map[n] = map.getOrDefault(n, 0) + 1
        }

        map.forEach { (key, value) ->
            if (value.isPrime()) return true
        }

        return false
    }

    private fun Int.isPrime(): Boolean {
        if (this < 2) return false
        val sqrt = sqrt(this.toDouble()).toInt()
        return (2..sqrt).none { this % it == 0 }
    }
}
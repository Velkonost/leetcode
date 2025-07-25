class Solution {
    fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        envelopes.sortWith(compareBy<IntArray> { it[0] }.thenByDescending { it[1] })
        
        val nums = envelopes.map { it[1] }
        val dp = mutableListOf<Int>()

        for (num in nums) {
            if (dp.isEmpty() || num > dp.last()) {
                dp.add(num)
            } else {
                val i = binarySearch(dp, num)
                dp[i] = num
            }
        }

        return dp.size
    }

    fun binarySearch(arr: MutableList<Int>, target: Int): Int {
        var left = 0
        var right = arr.size - 1

        while (left < right) {
            val mid = (left + right) / 2
            
            when {
                arr[mid] == target -> return mid
                arr[mid] < target -> left = mid + 1
                else -> right = mid
            }
        }

        return left
    }
}
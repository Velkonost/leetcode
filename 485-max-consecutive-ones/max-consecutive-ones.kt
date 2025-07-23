class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var curr = 0
        for (i in 0..nums.size - 1) {
            if (nums[i] == 1) curr ++
            else {
                if (curr > max) max = curr
                curr = 0
            }
        }
        if (curr > max) max = curr
        return max
    }
}
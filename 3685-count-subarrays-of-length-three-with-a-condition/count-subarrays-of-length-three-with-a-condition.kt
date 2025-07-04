class Solution {
    fun countSubarrays(nums: IntArray): Int {
        var i = 0
        var j = 2

        var res = 0
        while (j < nums.size) {
            val sumNeighbours = nums[i] + nums[j]
            val center = nums[i + 1]
            if (center % 2 == 0 && center / 2 == sumNeighbours) res ++

            i ++
            j ++
        }

        return res
    }
}
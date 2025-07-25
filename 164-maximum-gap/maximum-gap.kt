class Solution {
    fun maximumGap(nums: IntArray): Int {
        if (nums.size < 2) return 0
        nums.sort()
        var res = -1
        for (i in 1..<nums.size) {
            val diff = nums[i] - nums[i - 1]
            res = max(diff, res)
        }
        return res
    }
}
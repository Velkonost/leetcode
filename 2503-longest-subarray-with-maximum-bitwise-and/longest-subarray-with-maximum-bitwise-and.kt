class Solution {
    fun longestSubarray(nums: IntArray): Int {
        val max = max(nums)
        
        var seq = 0
        var maxSeq = 0
        var i = 0
        while (i < nums.size) {
            if (nums[i] == max) {
                seq++
                maxSeq = Math.max(maxSeq, seq)
            } else {
                seq = 0
            }
            i++
        }
        return maxSeq
    }
    
    private fun max(nums: IntArray): Int {
        var max = 0
        for (i in 0 until nums.size) {
            max = Math.max(max, nums[i])
        }
        return max
    }
}
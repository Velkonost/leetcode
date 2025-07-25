class Solution {
    fun maxSum(nums: IntArray): Int {
        val numSet = nums.toSet().filter { it >= 0}
        if (numSet.size < 2){
            return nums.max()
        }
        return numSet.sum()
    }
}
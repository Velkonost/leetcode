class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        for (i in 0 until nums.size) {
            for (j in i + 1 until minOf(i + k + 1, nums.size)) {
                if (nums[i] == nums[j]) return true
            }
        }

        return false
    }
}
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = hashMapOf<Int, Boolean>()

        for (i in 0..<nums.size) {
            if (map.contains(nums[i])) {
                return true
            }
            map[nums[i]] = true
        }

        return false
    }
}
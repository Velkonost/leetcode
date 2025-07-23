class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = hashMapOf<Int, Int>()

        for (i in 0..nums.size - 1) {
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
            if (map[nums[i]]!! >= (nums.size / 2) + 1) {
                return nums[i]
            }
        } 

        return 0
    }
}
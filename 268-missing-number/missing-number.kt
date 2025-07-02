class Solution {
    fun missingNumber(nums: IntArray): Int {
        val map = sortedMapOf<Int, Boolean>()
        nums.forEach {
            map[it] = true
        }

        val sum = map.keys.sum()
        val last = max(map.keys.last(), nums.size)
        val needed = (0..last).sum()
        return needed - sum
    }
}
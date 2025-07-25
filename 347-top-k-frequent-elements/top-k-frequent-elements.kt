class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for (i in 0..<nums.size) {
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
        }

        return map.entries.sortedBy { it.value }.takeLast(k).map { it.key }.toIntArray()
    }
}
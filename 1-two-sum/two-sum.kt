class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
 val map = linkedMapOf<Int, Int>()
    

    for ((index, element) in nums.withIndex()) {
        val remain = target - element

        map[remain]?.let {
           return intArrayOf(it, index)
        }

        map[element] = index
    }
    return intArrayOf()
    }
}
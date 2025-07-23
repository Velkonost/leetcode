class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        val sort = nums.filter { it > 0 }.sorted()
        if (sort.isEmpty() || sort[0] != 1) return 1
        
        for (i in 1..sort.size-1) {
            val curr = sort[i]
            val prev = sort[i - 1] 
            if (curr - prev > 1) {
                return prev + 1
            }
        }
        return sort.last() + 1
    }
}
class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        if (k == 0) return 

        val temp = nums[nums.size - 1]
        for (i in nums.size - 1 downTo 1) {
            nums[i] = nums[i - 1]
        }        
        nums[0] = temp
        // nums.map {
        //     print(it.toString())
        // }
        // println()
        rotate(nums, k - 1)
    }
}
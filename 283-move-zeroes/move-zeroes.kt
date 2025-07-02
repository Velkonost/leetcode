class Solution {
    fun moveZeroes(nums: IntArray): Unit {
           var pointer = 0
        nums.forEach {
            if (it != 0) {
                nums[pointer] = it
                pointer++
            }
        }
        while (pointer < nums.size) {
            nums[pointer] = 0
            pointer ++
        }
    }
}
class Solution {
    fun wiggleSort(nums: IntArray): Unit {
        val list = nums.sorted().toMutableList()

        for (i in 1 ..<nums.size step 2) {
            nums[i] = list.last()
            list.remove(list.last())
        }

        for (i in 0..<nums.size step 2) {
            nums[i] = list.last()
            list.remove(list.last())
        }
    }
}
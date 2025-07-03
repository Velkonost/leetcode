class NumArray(nums: IntArray) {

    private val list = IntArray(nums.size + 1).also {
        for (i in 1..it.lastIndex) {
            it[i] = it[i - 1] + nums[i - 1]
        }
    }
    fun sumRange(left: Int, right: Int): Int {
        return list[right + 1] - list[left]
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */
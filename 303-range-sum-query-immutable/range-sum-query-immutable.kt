class NumArray(nums: IntArray) {

    private val list = nums
    fun sumRange(left: Int, right: Int): Int {
        var res = 0
        for (i in left..right) {
            res += list[i]
        }
        return res
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */
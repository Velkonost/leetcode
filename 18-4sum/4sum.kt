class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        nums.sort() // Skipping numbers, 2 pointers at k==2, 
                    // need sorted array
        return recurse(0, nums, target.toLong(), 4)
    }

    fun recurse(start: Int, nums: IntArray, target: Long, k: Int): List<List<Int>> {
        if (k == 2) {
            
            // When we are at 2sum, just take a 2 pointers solution
            var l = start
            var r = nums.size - 1
            val res = mutableListOf<MutableList<Int>>()

            while (l < r) {
                val sum: Long = nums[l].toLong() + nums[r].toLong()
                if (sum == target) {
                    res.add(mutableListOf(nums[l], nums[r]))
                    val rval = nums[r]
                    val lval = nums[l]
                    while (r > 0 && rval == nums[r]) r--
                    while (l < nums.size && lval == nums[l]) l++
                } else if (sum < target) {
                    l++
                } else {
                    r--
                }
            }
            return res

        } else {
            // When we are at k, include this number and recurse starting 
            // from i+1 (do not include this number)... also skip
            // duplicate numbers (nums[i] != nums[i - 1]) a per task
            // description

            val res = mutableListOf<List<Int>>()
            for (i in start..nums.size - k) {
                val v = nums[i]
                if (i == start || nums[i] != nums[i - 1]) {
                    val r = recurse(i + 1, nums, target - v, k - 1)
                    r.forEach {
                        res.add(it + v)
                    }
                }
            }
            return res
        }
    }
}
class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) return emptyList<String>()
        val ans = mutableListOf<String>()

        var start: Int? = nums[0]
        for (i in 1 until nums.size) {
            if (nums[i] - 1 == nums[i - 1]) continue
            else {
                if (start == nums[i - 1]) {
                    ans.add("${start}")
                } else {
                    ans.add("${start}->${nums[i-1]}")
                }
                start = nums[i]
            }
        }

        if (start != null) {
            if (start == nums.last()) {
                    ans.add("${start}")
                } else {
                    ans.add("${start}->${nums.last()}")
                }
        }

        return ans
    }
}
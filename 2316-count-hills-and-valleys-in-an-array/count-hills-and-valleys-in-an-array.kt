class Solution {
    fun countHillValley(nums: IntArray): Int {
        val temp = mutableListOf<Int>()
        for (x in nums) {
            if (temp.isNotEmpty() && temp.last() == x) continue
            temp.add(x)
        }
        var cnt = 0
        for (i in 1 until temp.size-1) {
            if ((temp[i] > temp[i-1] && temp[i] > temp[i+1]) ||
                (temp[i] < temp[i-1] && temp[i] < temp[i+1])) cnt++
        }
        return cnt
    }
}
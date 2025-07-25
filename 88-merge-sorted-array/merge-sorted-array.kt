class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val max = maxOf(m, n)
        for (i in 0..n - 1) {
            nums1[m + i] = nums2.getOrElse(i, {0})
        }
        nums1.sort()
    }
}
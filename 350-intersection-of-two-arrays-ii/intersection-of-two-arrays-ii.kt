class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap = hashMapOf<Int, Int>()
        val result = mutableListOf<Int>()

        nums1.forEach {
            hashMap[it] = hashMap.getOrDefault(it, 0) + 1
        }
        nums2.forEach {
            val value = hashMap.getOrDefault(it, null)
            if (value != null && value > 0) {
                result.add(it)
                hashMap[it] = value - 1
            }
        }
        return result.toIntArray()
    }
}
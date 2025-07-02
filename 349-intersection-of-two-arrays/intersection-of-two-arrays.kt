class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val hashMap = hashSetOf<Int>()
        val result = hashSetOf<Int>()
        
        nums1.forEach { 
            hashMap.add(it)
        }
        nums2.forEach { 
            if (it in hashMap) {
                result.add(it)
            }
        }
        return result.toIntArray()
    }
}

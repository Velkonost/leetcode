class Solution {
       fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val arr = IntArray(nums.size) { 0 }
        nums.forEach { 
            arr[it - 1] = 1
        }
        
        return arr.mapIndexed { index: Int, i: Int -> 
            if (i == 0) index + 1
            else null
        }.filterNotNull()
    }
}
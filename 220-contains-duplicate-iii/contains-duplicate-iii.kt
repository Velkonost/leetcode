class Solution {
    fun getKey(value: Int, base: Int): Int {
        return if (value > -1) value/(base+1) else (value-base)/(base +1)
    }

    fun containsNearbyAlmostDuplicate(nums: IntArray, indexDiff: Int, valueDiff: Int): Boolean {
        var j = 0
        val map = mutableMapOf<Int, Int>()
        
        while( j < nums.size){
            val key = getKey(nums[j], valueDiff)
            if(map[key] != null) return true
            if(map[key-1] != null && Math.abs(map[key-1]!! - nums[j]) <= valueDiff) return true
            if(map[key+1] != null && Math.abs(map[key+1]!! - nums[j]) <= valueDiff) return true
            map[key] = nums[j]

            if(j >= indexDiff){
                map.remove(getKey(nums[j-indexDiff], valueDiff))
            }
            j++
        }
        return false
    }
}
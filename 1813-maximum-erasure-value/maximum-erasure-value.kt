/**
 * Time Complexity:     O(`nNums`)
 * Space Complexity:    O(`nNums`)
 */
class Solution {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        val nNums = nums.size
        
        var lo = 0
        var hi = 0
        var largest = 0
        var sum = 0
        
        val seen = HashSet<Int>()
        
        while(hi < nNums) {
            sum += nums[hi]
			
            while(seen.contains(nums[hi])) {
                sum -= nums[lo]
                seen.remove(nums[lo])
                ++lo
            }
            
            seen.add(nums[hi])
            largest = maxOf(largest, sum)
            hi++
        }
        
        return largest
    }
}
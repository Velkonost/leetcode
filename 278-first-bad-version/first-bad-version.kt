/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var left = 1
        var right = n
        var result = -1
        while (right >= left) {
            val mid = left + (right - left) / 2
            val isBad = isBadVersion(mid)
            when {
                isBad -> {
                    result = mid
                    right = mid - 1
                }
                !isBad -> {
                    left = mid + 1
                }
            }
        }
        return result
	}
}
class Solution {
    fun findRightInterval(intervals: Array<IntArray>): IntArray {
        val sortedIntervals = intervals.withIndex().sortedBy { it.value[0] }
        val result = IntArray(intervals.size) { -1 }

        for (i in intervals.indices) {
            val interval = intervals[i]
            val index = sortedIntervals.binarySearchBy(interval[1]) { it.value[0] }

            if (index < 0) {
                val insertionPoint = -(index + 1)
                if (insertionPoint < intervals.size) {
                    result[i] = sortedIntervals[insertionPoint].index
                } else {
                    result[i] = -1
                }
            } else {
                result[i] = sortedIntervals[index].index
            }
        }

        return result
    }
}
class Solution {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        if (intervals.size == 0) return 0
        val list = mutableListOf<Pair<Int, Int>>()
        for (i in intervals) {
            list.add(i[0] to i[1])
        }
        val sorted = list.sortedWith(compareBy({it.first}, {it.second}))

        var left = sorted[0].second
        var res = 0

        for (i in 1..<sorted.size) {
            val right = sorted[i]
            if (right.first < left) {
                res ++
                left = min(left, right.second)
            } else {
                left = max(left, right.second)
            }
        }
        return res
    }
}
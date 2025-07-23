class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        last = timeSeries[0]
        result = 0
        var i = 1
        while (i != timeSeries.size) {
            val diff = timeSeries[i++] - last
            last += diff
            result += when {
                diff < duration -> diff
                else -> duration
            }
        }
        result += duration
        return result
    }

    companion object {
        var last = 0
        var result = 0
    }
}
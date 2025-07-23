class Solution {
    fun maxPoints(points: Array<IntArray>): Int {
        var res = 1 // if only 1 point, need return 1

        for ((i, point) in points.withIndex()) {
            val (x1, y1) = point
            val map = mutableMapOf<Double, Int>()

            for (j in i+1..points.lastIndex) {
                val (x2, y2) = points[j]

                val slope = when {
                    y1 == y2 -> 0.0
                    x1 == x2 -> Double.MAX_VALUE
                    else -> (y2 - y1) * 1.0 / (x2 - x1)
                }

                map[slope] = (map[slope] ?: 0) + 1

                res = maxOf(res, (map[slope] ?: 0) + 1) // + 1 is to count first point (x1, y1)
            }
        }

        return res
    }
}
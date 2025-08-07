class Solution {
    fun maxCollectedFruits(fruits: Array<IntArray>): Int {
        val n = fruits.size
        var total = 0

        for (i in 0 until n) total += fruits[i][i]

        var rightPath = intArrayOf(fruits[0][n - 1])
        var bottomPath = intArrayOf(fruits[n - 1][0])
        var window = 2

        for (step in 1 until n - 1) {
            val newRight = IntArray(window + 2)
            val newBottom = IntArray(window + 2)

            for (dist in 0 until window) {
                newRight[dist] = maxOf(
                    rightPath.getOrNull(dist - 1) ?: 0,
                    rightPath.getOrNull(dist) ?: 0,
                    rightPath.getOrNull(dist + 1) ?: 0
                ) + fruits[step][n - 1 - dist]

                newBottom[dist] = maxOf(
                    bottomPath.getOrNull(dist - 1) ?: 0,
                    bottomPath.getOrNull(dist) ?: 0,
                    bottomPath.getOrNull(dist + 1) ?: 0
                ) + fruits[n - 1 - dist][step]
            }

            rightPath = newRight
            bottomPath = newBottom

            window += if (window - n + 4 + step <= 1) 1 else if (window - n + 3 + step > 1) -1 else 0
        }

        return total + rightPath[0] + bottomPath[0]
    }
}
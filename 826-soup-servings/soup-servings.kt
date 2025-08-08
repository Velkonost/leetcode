class Solution {
    fun soupServings(n: Int): Double {
        if (n > THRESHOLD) return 1.0
        val cache = HashMap<Pair<Int, Int>, Double>()
        fun dfs(a: Int = n, b: Int = n): Double = cache.getOrPut(a to b) {
            when {
                a <= 0 && b <= 0 -> 0.5
                a <= 0 -> 1.0
                b <= 0 -> 0.0
                else -> 0.25 * (dfs(a - 100, b) +
                        dfs(a - 75, b - 25) +
                        dfs(a - 50, b - 50) +
                        dfs(a - 25, b - 75))
            }
        }
        return dfs()
    }

    companion object {
        const val THRESHOLD = 5_000
    }
}
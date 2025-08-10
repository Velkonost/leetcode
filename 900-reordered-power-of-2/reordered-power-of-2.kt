class Solution {
    fun reorderedPowerOf2(n: Int): Boolean {
        return n.toSortedChars() in valid
    }

    companion object {
        const val MAXN = 1_000_000_000

        private fun Int.toSortedChars(): String =
            toString().toCharArray().sorted().joinToString("")

        private val valid = mutableListOf(1).apply {
            while (last() < MAXN / 2) add(last() * 2)
        }.map { it.toSortedChars() }.toHashSet()
    }
}
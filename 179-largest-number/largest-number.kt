class Solution {
    fun largestNumber(nums: IntArray): String =
        nums.sortedWith(Comparator<Int> { a, b -> "$b$a".compareTo("$a$b") })
            .takeIf { it.firstOrNull() != 0 }
            ?.joinToString("") ?: "0"
}
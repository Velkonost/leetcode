class Solution {
    fun kthCharacter(k: Long, operations: IntArray): Char {
        val noOfOperations = ceil(log2(k.toDouble())).toInt()
        val countAfterAllOperations = 2.0.pow(noOfOperations).toLong()

        fun solve(o: Int, count: Long, index: Long, offset: Int): Char {
            if (o == 0) {
                return Char('a'.code + (offset % 26))
            }

            return if (index > count / 2) {
                solve(o - 1, count / 2, index - count / 2, offset + operations[o - 1])
            } else {
                solve(o - 1, count / 2, index, offset)
            }
        }

        return solve(noOfOperations, countAfterAllOperations, k, 0)
    }
}
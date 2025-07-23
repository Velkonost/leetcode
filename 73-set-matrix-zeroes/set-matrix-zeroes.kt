class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val zeroColumns = mutableSetOf<Int>()
        val zeroRows = mutableSetOf<Int>()

        val rows = matrix.size
        val columns = matrix[0].size
        
        for (i in 0..rows - 1) {
            for (j in 0..columns-1) {
                if (matrix[i][j] == 0) {
                    zeroColumns.add(j)
                    zeroRows.add(i)
                }
            }
        }

        for (i in 0..rows - 1) {
            for (j in 0..columns-1) {
                if (i in zeroRows || j in zeroColumns) {
                    matrix[i][j] = 0
                }
            }
        }

    }
}
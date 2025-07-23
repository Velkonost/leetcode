class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        val columns = grid.size
        val rows = grid[0].size
        var res = 0
        var visited = Array(columns) {
            BooleanArray(rows)
        }

        fun dfs(
            column: Int,
            row: Int,
        ) {
            if (
                column < 0 || column >= columns || row < 0 || row >= rows || grid[column][row] != 1
            ) {
                res ++
                return
            }
            if (visited[column][row]) return
            visited[column][row] = true
            
            dfs(column - 1, row)
            dfs(column + 1, row)
            dfs(column, row - 1)
            dfs(column, row + 1)
        }

        for (i in 0..columns - 1) {
            for (j in 0..rows - 1) {
                if (grid[i][j] == 1) {
                    dfs(i, j)
                }
            }
        }


        return res
    }
}
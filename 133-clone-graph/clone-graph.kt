/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: ArrayList<Node?> = ArrayList<Node?>()
 * }
 */

class Solution {
    fun cloneGraph(node: Node?): Node? {
        node ?: return null
        val nodes = Array<Node?>(101) { null }

        fun dfs(node: Node): Node {
            nodes[node.`val`]?.let {
                return it
            }
            val copy = Node(node.`val`)
            nodes[node.`val`] = copy
            for (n in node.neighbors) {
                val nCopy = dfs(n!!)
                copy.neighbors.add(nCopy)
            }
            return copy
        }
        return dfs(node)
    }

  
}
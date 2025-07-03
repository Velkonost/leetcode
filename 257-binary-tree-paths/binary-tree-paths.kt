/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun binaryTreePaths(root: TreeNode?): List<String> {
        return search(root, "", emptyList())
    }

    fun search(
        node: TreeNode?,
        path: String,
        list: List<String>
    ): List<String> {
        if (node == null) return list
        val updatedPath = if (path.isEmpty()) "${node.`val`}"
        else "$path->${node.`val`}"
        
        if (node.left == null && node.right == null) return list + updatedPath

        val leftList = search(node.left, updatedPath, list)
        val rightList = search(node.right, updatedPath, list)
        return leftList + rightList
    }
}
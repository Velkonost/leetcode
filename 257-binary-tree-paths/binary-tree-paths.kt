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
    val res = mutableListOf<String>()
    fun binaryTreePaths(root: TreeNode?): List<String> {
        search(root, "")
        return res
    }

    fun search(
        node: TreeNode?,
        path: String   
    ){
        if (node == null) return
        val updatedPath = if (path.isEmpty()) "${node.`val`}"
        else "$path->${node.`val`}"
        
        if (node.left == null && node.right == null) {
            res.add(updatedPath)
            return 
        }

        node.left?.let { search(it, updatedPath) }
        node.right?.let { search(it, updatedPath) }
    }
}
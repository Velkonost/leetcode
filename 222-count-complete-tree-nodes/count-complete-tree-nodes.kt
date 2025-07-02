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
    fun countNodes(root: TreeNode?): Int {
        return sum(root)
    }

    fun sum(node: TreeNode?): Int {
        node ?: return 0
        return 1 + sum(node?.left) + sum(node?.right)
    }
}
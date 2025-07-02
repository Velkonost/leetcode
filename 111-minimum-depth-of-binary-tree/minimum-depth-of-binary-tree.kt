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
    fun minDepth(root: TreeNode?): Int {
        return calc(root)
    }

    fun calc(
        node: TreeNode?,
    ): Int {
        if (node == null) return 0

        val leftAmount = calc(node.left)
        val rightAmount = calc(node.right)
        return if (leftAmount == 0 || rightAmount == 0) leftAmount + rightAmount + 1
        else min(leftAmount, rightAmount) + 1
    }
}

